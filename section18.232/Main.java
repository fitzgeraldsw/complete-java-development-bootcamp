import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Scott", "stocker");
        Employee assistantManager = new Employee("Nicholas", "assistant manager");
        Employee manager = new Employee("John", "manager");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assistantManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}