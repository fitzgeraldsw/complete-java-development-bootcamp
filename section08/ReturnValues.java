public class ReturnValues {
    public static void main(String[] args) {
        System.out.printf("area = %.2f feet squared%n", measureRectangle(4.3, 2.2));
    }

    public static double measureRectangle(double len, double wid) {
        double area = len * wid;
        return area;
    }
}
