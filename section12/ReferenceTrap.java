import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {

        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };

        // reference trap; do NOT set array variables equal to each other
        // String[] staffThisYear = staffLastYear;
        // BETTER
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        // for (int i = 0; i < staffLastYear.length; i++) {
        //     System.out.println(i);
        //     staffThisYear[i] = staffLastYear[i];
        // }

        // this updates BOTH arrays
        // staffThisYear[1] = "Abby";
        // the state of a variable should not change if you change another


        // now you only update one array
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        
        


    }
}
