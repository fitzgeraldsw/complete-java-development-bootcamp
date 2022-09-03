import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.printf("What is your first name? ");
        String firstName = scan.nextLine();

        //Ask for their last name.
        System.out.printf("What is your last name? ");
        String lastName = scan.nextLine();
        // scan.nextLine();

        //Ask: how old are you?
        System.out.printf("How old are you? ");
        int age = scan.nextInt();

        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        scan.nextLine();
        System.out.printf("Pick a username: ");  
        String username = scan.nextLine();

        //Ask what city they live in.
        System.out.printf("What city do you live in? ");  
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.printf("What country is that in? ");  
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.printf("%nThank you for joining JavaGram!%n%n");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        System.out.printf("First name: %s%n", firstName);  
        //        Last Name: Slim
        System.out.printf("Last name:  %s%n", lastName);  
        //        Age: 27
        System.out.printf("Age:        %d%n", age);  
        //        Username: monotonic_relu
        System.out.printf("Username:   %s%n", username);  
        //        City: Ottawa
        System.out.printf("City:       %s%n", city);  
        //        Country: Canada
        System.out.printf("Country:    %s%n", country);  
        //


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}