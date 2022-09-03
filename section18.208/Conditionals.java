public class Conditionals {
    public static void main(String[] args) {

        int age = 24;
        double debt = 4000;

        String creditScore = debt > 0 ? "Bad" : "Good";
        boolean overEighteen = age >= 18;

        if (overEighteen && creditScore.equals("Good")) {
            System.out.println("We're processing your application");
        } else {
            System.out.println("You cannot apply");
        }

    }
}