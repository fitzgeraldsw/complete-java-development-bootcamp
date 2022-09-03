import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************\n\n");
        
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("Coca-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);
        Scanner scan = new Scanner(System.in);


        boolean state = true;

        while (true) {

            int selection = 1;

            System.out.print("\tPick a row: "); 
            int row = scan.nextInt();
            System.out.print("\tPick a spot in the row: "); 
            int spot = scan.nextInt();
            System.out.printf("        this spot has %d drink(s)", machine.getItem(row, spot).getQuantity());
            System.out.println("\n" + machine);

            if (machine.getItem(row, spot).getQuantity() > 0) {
                
                System.out.printf("%n        Enjoy your drink! Press 1 to purchase another or 2 to exit: ");
                selection = scan.nextInt();
            } else {
                System.out.printf("%n        Sorry, we're out of this item. Press 1 to purchase another or 2 to exit: ");
                selection = scan.nextInt();
            }
            machine.dispense(row, spot);

            if (selection != 1) {
                System.out.println("\tBYE!");
                break;
            }
        }
    }
}