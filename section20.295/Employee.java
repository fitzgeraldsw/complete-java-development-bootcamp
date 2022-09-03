public class Employee {

    private String name;
    private String position;
    private static int hiredCount; 
    private static final String COMPANY_NAME = "JAVASTARS";

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        hiredCount++;
    }
  
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
        // return this.name; = same as above
        // this keyword point to the current object that was created
    }
    
    public String getPosition() {
        return position;
    }

    // static method belongs to class not object!
    // static method can only access static variables
    public static int getHiredCount() {
        return hiredCount;
    }

    // good practice to do this
    public static String getCompanyName() {
        return COMPANY_NAME;
    }
  
    public void greet(String company) {
        if (company.equals("JAVASTARS")) {
            System.out.println("Welcome!");
        }
    }

    public String toString() {
        return "\tName: " + name + "\tPosition: " + this.position + "\tCompany: " + "JAVASTARS" + "\n";
    }
}