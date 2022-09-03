import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // the hash codes are different
        Car honda = new Car("Honda", 2020);
        // System.out.println(honda.hashCode());

        Car honda2 = new Car(honda);
        // System.out.println(honda2.hashCode());

        HashMap<Car,Double> inventory = new HashMap<Car,Double>();
        inventory.put(honda, 10000.00);
        inventory.put(honda2, 10000.00);

        System.out.println(honda.equals(honda2));
        System.out.println(inventory.get(honda));
        
    }
}