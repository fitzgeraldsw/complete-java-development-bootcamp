public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");
        Car sameCar = new Car(car);

        System.out.println(car.equals(sameCar));
    }
}