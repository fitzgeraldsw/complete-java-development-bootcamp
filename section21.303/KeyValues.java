import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {

        // HashMaps are not ordered
        HashMap<String, Double> items = new HashMap<String, Double>();
        items.put("Cauliflower", 4.99);
        items.put("Spaghetti Squash", 1.99);
        items.put("Parsley", 6.99);
        items.put("Banana", 1.99);

        // System.out.println(items.containsKey("Parsley"));
        // System.out.println(items.containsValue(1.99));

        items.forEach((key,value) -> {
            System.out.printf("%s: %.2f%n", key, value);
        });

        // System.out.println(items.get("Spaghetti Squash"));

        System.out.println("\n" + items);
    }
}