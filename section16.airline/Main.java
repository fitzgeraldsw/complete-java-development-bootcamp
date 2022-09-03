public class Main {
    public static void main(String[] args) {

        // 11 possible passengers
        Person[] passengers = new Person[] {
            new Person("Cleopatra", "Egypt", "69 BC", 0),
            new Person("Alexander the Great", "Macedon", "356 BC", 0),
            new Person("Julius Caesar", "Rome", "100 BC", 0),
            new Person("Hannibal", "Carthage", "247 BC", 0),
            new Person("Confucius", "China", "551 BC", 0),
            new Person("Pericles", "Greece", "429 BC", 0),
            new Person("Spartacus", "Thrace", "111 BC", 0),
            new Person("Marcus Aurelius", "Rome", "121 AD", 0),
            new Person("Leonidas", "Greece", "540 BC", 0),
            new Person("Sun Tzu", "China", "544 BC", 0),
            new Person("Hammurabi", "Babylon", "1750 BC", 0)
        };

        Flight flight = new Flight();
        boolean[] seatsTaken = new boolean[passengers.length];
 
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].hasPassport() == true) {
                passengers[i].setPassport();
                flight.createReservation(passengers[i], seatsTaken, i);
            } else {
                String name00 = passengers[i].getName();
                System.out.println(name00 + " does not have a passport.");
            }
        }
 
        System.out.println("********************** Reservations are complete for Flight 4444! **********************\n");
        System.out.println(flight);
        

    }
}