import java.util.ArrayList;

public class Filter1 {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream()
            // only one line; remove curly brackets
            .filter((price) -> price < 5.0)
            .forEach((price) -> System.out.println(price));

        // filterLowPrices();

    }

    // public static void filterLowPrices() {
    //     System.out.println("\n\nLOW PRICES");
    //     for (int i = 0; i < prices.size(); i++) {
    //         if (prices.get(i) < 5) {
    //             System.out.println(prices.get(i)); 
    //         }
    //     }
    // }

}