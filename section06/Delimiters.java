import java.util.Scanner;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two integers on the same line:");
        int int00 = scan.nextInt();
        int int01 = scan.nextInt();

        System.out.println("enter two very big integers on the same line:");
        long long00 = scan.nextLong();
        long long01 = scan.nextLong();

        System.out.println("enter two floats on the same line:");
        double double00 = scan.nextDouble();
        double double01 = scan.nextDouble();

        System.out.println("enter two strings on the same line:");
        String string00 = scan.next();
        String string01 = scan.next();

        // scan.nextLine() reads the ENTIRE line

        // scan.nextLine() TRAP
        // happens when scan.nextLine() is AFTER of (reads the rest of the empty line)
        // scan.nextInt()
        // scan.nextLong()
        // scan.nextDouble()
        // scan.next()

        // use throwaway scan.nextLine() before scan.nextLine()

        scan.close();

    }
}
