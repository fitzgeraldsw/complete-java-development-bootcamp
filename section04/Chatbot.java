import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //set up scanner.
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = scan.nextLine();

                           
        //add new a line before asking next question. 
        System.out.printf("Hi %s! I'm Javabot. Where are you from?%n", name);
        //Pick up user's home and store it. 
        String country = scan.nextLine();
                        

        //add new a line before asking next question.
        System.out.printf("I hear it's beautiful in %s! I'm from a place called Oracle%n", country);
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scan.nextInt();

        //add new a line before asking next question.
        System.out.printf("So you're %d, cool! I'm 400 years old.%n", age);
        System.out.printf("This means I'm %d times older than you.%n", 400/age);
        System.out.println("Enough about me. What's your favourite programming language? (just don't say Python)");
        //Pick up language and store it. 
        scan.nextLine();
        String language = scan.nextLine();


        //add new a line here.
        System.out.printf("%s, that's great! Nice chatting with you %s. I have to log off now. See ya!%n", language, name);
        
        //close scanner. 
        scan.close();

        
    }
}