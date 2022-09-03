public class Wrapper {
    public static void main(String[] args) {

        // int wholeNumber = 5;
        // long largeWholeNumber = 5000000000L;
        // double decimal = 5.493;
        // char letter = 'b';

        Integer wholeNumber = 5; // this is an object: new Integer(5) is deprecated
        Long largeWholeNumber = 5000000000L;
        Double decimal = 5.493;
        Character letter = 'b';

        System.out.println(wholeNumber);
        System.out.println(largeWholeNumber);
        System.out.println(decimal);
        System.out.println(letter);



        // no primitive for String
        String name = "Scott";
        System.out.println(name.charAt(0));

        // String name2 = new String("Luke");  // this is NOT deprecated
        // System.out.println(name2.charAt(0));

        String name2 = name;
        name2 = "Luke";
        System.out.println(name2);

    }
}