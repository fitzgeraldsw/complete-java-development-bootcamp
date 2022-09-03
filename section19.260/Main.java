import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import models.Item;
import models.Cart; 
import models.Store;

public class Main {
    
    static Store store = new Store();
    static Cart cart = new Cart();

    public static void main(String[] args) {

        try {
            loadItems("products.txt");
            manageItems();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        
    }

        /**
     * Name: loadItems
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   1. loads items from <fileName>.txt.
     *      • while loop runs through every line in <fileName>
     *      • scan.nextLine() picks up the entire line.
     *      • splits each String using the ";" separator.
     *      • splits both fields in each String using the "=" separator.
     *      • Parse each price into a Double.
     *   2. adds all items to the store object's items field.
     */
    public static void loadItems(String fileName) throws FileNotFoundException {
        // loads items into store (stocks the shelves)
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        for (int i = 0; scanFile.hasNextLine(); i++) {
            String line = scanFile.nextLine();
            String[] items = line.split(";");

            for (int j = 0; j < items.length; j++) {
                String[] fields = items[j].split("=");
                store.setItem(i, j, new Item(fields[0], Double.parseDouble(fields[1])));
            }
        }
        scanFile.close();
    }

    /**
     * Name: manageItems
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. Creates an infinite loop:     
     *   •        The user can choose to a) add or b) remove c) checkout.
     *   •          case a: asks for the aisle and item number. Then, adds item to cart.
     *   •          case b: asks for the name. Then, removes item from cart.
     *   •          case c: prints the receipt and closes Scanner.
     *   •        Prints the updated shopping cart.
     */
 
     public static void manageItems() {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\n\t******************************JAVA GROCERS INVENTORY********************");
            System.out.println("\tWe never run out!");
            System.out.println("\tbut you can only buy one of each item!\n");
            System.out.println(store);

            System.out.println("Options: \n\ta) Add to cart\n\tb) Remove from cart \n\tc) Checkout\n\td) exit");
            String response = scan.nextLine();

            switch (response) {
                case "a":
                    System.out.print("\nChoose a store aisle number between: 1 - 7: ");
                    int row = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                    scan.nextLine();
        
                    System.out.print("Choose an item number between: 1 - 3: ");
                    int column = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                    scan.nextLine();

                    if (row == 404 || column == 404) {
                        System.out.println("invalid input");
                        continue;
                    } else if (row < 0 || row > 6 || column < 0 || column > 2) {
                        System.out.println("invalid input");
                        continue;
                    }

                    Item item = store.getItem(row, column);

                    if (!(cart.add(item))) {
                        System.out.println(item.getName() + " is already in your shopping cart.");
                    } else {
                        System.out.println(item.getName() + " was added to your shopping cart.");
                    }
                    break;
                case "b":
                    if (cart.isEmpty()) {
                        System.out.println("cart is empty");
                        continue;
                    }
                    System.out.print("Enter the item you'd like to remove: ");
                    cart.remove(scan.nextLine());
                    break;
                case "c":
                    if (cart.isEmpty()) {
                        System.out.println("you must buy something in order to checkout");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            System.out.println(e.getMessage());
                        }
                        continue;
                    }
                    System.out.println(cart.checkout());
                    scan.close();
                    return;
                case "d":
                System.out.println("Thank you for shopping with Java Grocers!");
                    return;
                default:
                    continue;
            }

            System.out.println("\n\nSHOPPING CART CONTENTS" + cart);
            if (cart.isEmpty()) {
                System.out.println("empty\n");
            }
            System.out.print("Enter anything to continue: ");
            scan.nextLine();
        }
     }
}