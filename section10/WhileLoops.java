public class WhileLoops {
    public static void main(String[] args) {
        double choice = 0.01;
        double guess = 0.99;

        while (guess > choice) {
            // System.out.println("high as fuck...");
            guess = Math.random();
            System.out.printf("%.6f%n", guess);
        }
    }
}
