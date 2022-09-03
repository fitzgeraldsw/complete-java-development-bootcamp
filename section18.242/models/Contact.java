package models;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Contact {

    private String name;
    private String birthDate;
    private String phoneNumber;
    private int age;

    public Contact(String name, String birthDate, String phoneNumber) throws ParseException {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        if (birthDate == null || birthDate.isBlank()) {
            throw new IllegalArgumentException("birthday cannot be null/blank");
        }
        if (birthDate.length() < 8) {
            throw new IllegalArgumentException("birthday can't be less than 8 characters");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null/blank");
        }
        if (phoneNumber.length() < 7) {
            throw new IllegalArgumentException("phone number can't be less than 7 characters");
        }

        String[] dateArray = birthDate.split("/");
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        if (Integer.parseInt(dateArray[0]) < 1 || Integer.parseInt(dateArray[0]) > 12) {
            throw new DateTimeException("month must be between 1-12");
        }
        if (Integer.parseInt(dateArray[1]) < 1 || Integer.parseInt(dateArray[0]) > 31) {
            throw new DateTimeException("day must be between 1-31");
        }
        if (Integer.parseInt(dateArray[2]) < 1900 || Integer.parseInt(dateArray[2]) > year) {
            throw new DateTimeException("year must be greater than 1900 and less than or equal to current year");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);

    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        this.name = name;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        if (birthDate == null || birthDate.isBlank()) {
            throw new IllegalArgumentException("birthday cannot be null/blank");
        }
        if (birthDate.length() < 8) {
            throw new IllegalArgumentException("birthday can't be less than 8 characters");
        }
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null/blank");
        }
        if (phoneNumber.length() < 7) {
            throw new IllegalArgumentException("phone number can't be less than 7 characters");
        }
        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

        /**
     * Name: toAge
     * @param birthDate
     * @return age (int)
     * @throws ParseException
     *
     * Inside the function:
     *   1. Parses a date from the birthDate String
     *   2. Gets the current date
     *   3. Subtracts the difference and returns the age.
     *
     */
    public int toAge(String birthDate) throws ParseException {
        String[] dateArray = birthDate.split("/");
        LocalDate start = LocalDate.of(Integer.parseInt(dateArray[2]), Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]));
        LocalDate end = LocalDate.now();
        long age = ChronoUnit.YEARS.between(start, end);
        return (int)age;

        // SImpleDateFormat formatter = new SimplaDateFormat("MM/dd/yyyy");
        // formatter.setLenient(false);
        // long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        // return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    public String toString() {
        return "Name: " + this.name + "\n" + 
        "Phone number: " + this.phoneNumber + "\n" + 
        "Birth Date: " + this.birthDate + "\n" + 
        "Age: " + this.age + " years old\n";
    }

}