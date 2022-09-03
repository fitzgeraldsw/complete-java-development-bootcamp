import java.util.Scanner;

import org.w3c.dom.css.CSSFontFaceRule;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome.  Thank you for taking the survey");
        int counter = 0;

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee every day?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food every day?");
        double fastFoodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow much times a week do you buy fast food?");
        int fastFoodAmount = scan.nextInt();
        counter++;

        scan.close();

        System.out.printf("%n%nThank you for answering the %d questions, %s!%n", counter, name);
        System.out.println("Your fast food expenses are " + (fastFoodPrice/coffeePrice) + " times more than your coffee expenses");
    }
}
