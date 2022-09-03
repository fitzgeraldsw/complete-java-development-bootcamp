public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);

        String sentence01 = "I love this course!";
        String sentence02 = "I love this course!";

        System.out.println(sentence01.equals(sentence02));
        System.out.println(!sentence01.equals(sentence02));
    }
}
