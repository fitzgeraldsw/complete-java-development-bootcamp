public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        if (random == 0 || random == 1) {
            System.out.println("Prime or Composite: " + "COMPOSITE");
        } else {
            System.out.println("Prime or Composite: " + isPrime(random));
        }
        
    }

    public static int random(int range) {
        // creates random number between 1-15
        double random = Math.random() * range + 1;
        return (int) random;
    }

    public static String isPrime(int random) {
        // zero and one are NOT PRIME
        String isPrime = "";
        for (int i = 2; i < random; i++) {
            if (random % i == 0) {
                isPrime = "COMPOSITE";
                return isPrime;
            }
        }
        isPrime = "PRIME";
        return isPrime;
    }
}