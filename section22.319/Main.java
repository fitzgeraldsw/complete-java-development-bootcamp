import java.util.Arrays;

// import models.Discountable;
import models.Pants;
import models.Product;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Pants[] products1 = new Pants[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        };

        Shirt[] products2 = new Shirt[] {
            new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
            new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
            new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
            new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
            new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
            new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
        };

        Arrays.sort(products1);
        printArray(products1);
        System.out.println();
        Arrays.sort(products2);
        printArray(products2);

    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}