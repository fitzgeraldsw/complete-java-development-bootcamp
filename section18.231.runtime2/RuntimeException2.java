public class RuntimeException2 {
    public static void main(String[] args) {
        String word = null;
        
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "<local1>" is null
        // at RuntimeException2.main(RuntimeException2.java:4)

        // word.equals(word) will ALSO throw NullPointerException
        if (word == null) {
            System.out.println("NULL");
        } else {
            // DEAD code
            word.toLowerCase();
        }
    }
}