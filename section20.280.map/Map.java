import java.util.ArrayList;
import java.util.stream.Collectors;

public class Map {

    static ArrayList<Double> prices = new ArrayList<Double>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> taxedAmount = new ArrayList<Double>();
        taxedAmount.addAll(prices.stream()
        .map((price) -> {
            return price * 1.13;
        })
        .collect(Collectors.toList()));

    }

    // public static void tax(ArrayList<Double> taxedAmount) {
    //     for (int i = 0; i < prices.size(); i++) {
    //             taxedAmount.add(prices.get(i) * 1.13);
    //     }
    // }

}