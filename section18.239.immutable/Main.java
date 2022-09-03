public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); // immutable b/c NO setters (mutators)

        // immutable objects does not fall into the reference trap
        Person person2 = person;  // no way to update state

        person2 = new Person("Scott", "American");
        System.out.println(person.getName());
        System.out.println(person2.getName());

        int[][] numbers = new int[][] {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}