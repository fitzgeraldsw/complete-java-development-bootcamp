import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        if (scan.hasNextInt()) {
            System.out.println(scan.nextInt());
        } else {
            System.out.println(scan.nextLine() + " (I was expecting a number)");
        }

        // expects integer but pass in String
        // Please enter a number: hi
        // Exception in thread "main" java.util.InputMismatchException
        // at java.base/java.util.Scanner.throwFor(Scanner.java:943)
        // at java.base/java.util.Scanner.next(Scanner.java:1598)
        // at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
        // at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
        // at RuntimeException3.main(RuntimeException3.java:6)

        scan.close();
    }
}