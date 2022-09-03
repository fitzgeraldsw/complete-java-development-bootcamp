import java.util.Scanner;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter three numbers on the same line:");
        int guess1 = scan.nextInt();
        int guess2 = scan.nextInt();
        int guess3 = scan.nextInt();
        int guessTotal = guess1 + guess2 + guess3;
        System.out.println();

        if (guess1 < 1 || guess2 < 1 || guess3 < 1) {
            System.out.println("invalid input");
            System.exit(0);
        }

        if (guess1 > 6 || guess2 > 6 || guess3 > 6) {
            System.out.println("invalid input");
            System.exit(0);
        }

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.printf("your three random dice roles are %d, %d, and %d%n%n", roll1, roll2, roll3);
        int rollTotal = roll1 + roll2 + roll3;

        System.out.println("if dice total is less than guess total and there is a difference of less than three, you WIN!\n");



        System.out.printf("guess total = %d%n", guessTotal);
        System.out.printf("dice total = %d%n%n", rollTotal);

        if (guessTotal > rollTotal && (guessTotal - rollTotal) < 3) {
            System.out.println("WINNER");
        } else {
            System.out.println("LOSER");
        }
        
        scan.close();
        
    }

    public static int rollDice() {
        double randomNumber = (Math.random() * 6) + 1;
        return (int)randomNumber;
    }
}
