import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {

        // 3 rows, 4 columns
        int[][] grades = {
            {70, 71, 72, 73},
            {80, 81, 82, 83},
            {90, 91, 92, 93}
        };

        System.out.printf("     Harry:    %s%n", Arrays.toString(grades[0]));
        System.out.printf("     Ron:      %s%n", Arrays.toString(grades[1]));
        System.out.printf("     Hermione: %s%n", Arrays.toString(grades[2]));

        // grades.length = # of rows = 3


        String prefix1 = "short text:";
        String prefix2 = "looooooooooooooong text:";
        String msg = "indented";
        /*
        * The second string begins after 40 characters. The dash means that the
        * first string is left-justified.
        */

        System.out.printf("%-40s%s%n", prefix1, msg);
        System.out.printf("%-40s%s%n", prefix2, msg);
    }
}
