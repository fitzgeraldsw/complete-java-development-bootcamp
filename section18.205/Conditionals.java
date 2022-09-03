public class Conditionals {
    public static void main(String[] args) {
        String option = "";

        int random = (int) (Math.random() * 3 + 1);
        // System.out.println(random);
        
        switch (random) {
            case 1: 
                option = "hit";
                System.out.println("hit");
                break; 
            case 2: 
                option = "stay";
                System.out.println("stay");
                break;
            case 3: 
                option = "fold";
                System.out.println("fold");
                break;
            default: 
                option = "This should never get called";
        }
    }
}