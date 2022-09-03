import java.util.Scanner;

import models.Car;
import models.Dealership;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000),
            new Car("Honda", 12000),
        };

        cars[1].setMake("Toyota");
        cars[1].setPrice(8500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");

        while (true) {
            System.out.println(dealership);

            if (dealership.isEmpty()) {
                System.out.println("we're all sold out");
                break;
            }

            System.out.print("Enter the spot number of the car you want to buy: ");

            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("invalid input");
                continue;
            }
            int spot = scan.nextInt();
            scan.nextLine();
            if (spot < 0 || spot > dealership.getLength() - 1) {
                System.out.println("invalid index");
                continue;
            } else if (dealership.getCar(spot) == null) {
                System.out.println("empty spot");
                continue;
            }
            dealership.sell(spot);
            System.out.print("type y to continue shopping: ");
            if (!scan.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

       // scan.close();

    }
}