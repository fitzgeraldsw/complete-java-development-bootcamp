public class RuntimeException1 {
    public static void main(String[] args) {

        // unchecked exceptions
        // ArrayIndexOutOfBoundsExceptions
        int[] array = new int[3];
        System.out.println(array[2]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        // at RuntimeException1.main(RuntimeException1.java:7)
        // never catch unchecked exceptions

        





    }
}