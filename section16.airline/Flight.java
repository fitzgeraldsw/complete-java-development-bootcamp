// import java.util.Arrays;

public class Flight {

    Person[] seatAssignments;
 
    public Flight() {
        this.seatAssignments = new Person[11];
    }
 
    public Person getPerson(int index) {
        return new Person(this.seatAssignments[index]);
    }
 
    public void setPerson(Person person) {
        this.seatAssignments[person.getSeatNumber() - 1] = new Person(person);
    }
    
 
    public void createReservation(Person person, boolean[] seatsTaken, int i) {
        // System.out.println(i);

        int randomSeat = person.chooseSeat();
        boolean done = false;

        while (!done) {
            if (seatsTaken[randomSeat - 1]) {
                System.out.println("Seat: " + randomSeat + " is already taken. Please choose another seat.\n");
                randomSeat = person.chooseSeat(); 
            } else {
                done = true;
            }
        }

        seatsTaken[randomSeat - 1] = true;
        // System.out.println(Arrays.toString(seatsTaken));
        person.setSeatNumber(randomSeat);
        seatAssignments[randomSeat - 1] = new Person(person);
        // seatAssignments[index] = new Person(person); 
        System.out.println("\nThank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }
 
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.seatAssignments.length; i++) {
            // System.out.println(seatAssignments[i]);
            if (seatAssignments[i] != null) {                      
                temp += seatAssignments[i].toString();
                temp += "\n\n";    
            } 
            else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }
}