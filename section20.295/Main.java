public class Main {
  
    public static void main(String[] args) {

        // To call any non-static method or variable in a static context, 
        // you need to first construct the object with a constructor or a factory 
        
        Employee employee01 = new Employee("Scott", "SRE");
        Employee employee02 = new Employee("Liza", "LCSW");
        Employee employee03 = new Employee("Luke", "Student");

        System.out.println(Employee.getHiredCount());
      
    }
  
}