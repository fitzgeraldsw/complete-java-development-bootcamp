public class TypeConversion {
    public static void main(String[] args) {
        double decimal = 4.99;
        decimal = Math.round(decimal);
        System.out.println(decimal);
        int integer;

        integer = (int)decimal;
        System.out.println(integer);
    }
}
