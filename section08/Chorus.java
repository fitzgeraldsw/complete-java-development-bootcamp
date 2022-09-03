public class Chorus {
    public static void main(String[] args) {
        singChorus(5);
    }

    public static void singChorus(int numberOfTimes) {

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Don't blame it on the sunshine");
            System.out.println("Don't blame it on the moonlight");
            System.out.println("Don't blame it on good times");
            System.out.println("Blame it on the boogie\n");
        }
        
    }
}

// A static method can be accessed without creating an object of the class first:
// public class Main {
//     // Static method
//     static void myStaticMethod() {
//       System.out.println("Static methods can be called without creating objects");
//     }
  
//     // Public method
//     public void myPublicMethod() {
//       System.out.println("Public methods must be called by creating objects");
//     }
  
//     // Main method
//     public static void main(String[ ] args) {
//       myStaticMethod(); // Call the static method
//       // myPublicMethod(); This would output an error
  
//       Main myObj = new Main(); // Create an object of Main
//       myObj.myPublicMethod(); // Call the public method
//     }
//   }