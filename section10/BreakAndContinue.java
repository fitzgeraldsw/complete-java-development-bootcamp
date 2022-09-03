public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                // finishes the loops at that point and starts on the next
                continue;
                // break ends the loop
                // break;
            }
            System.out.println(i);
        }
    }
}
