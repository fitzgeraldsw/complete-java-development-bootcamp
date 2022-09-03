public class Weather {
    public static void main(String[] args) {
        double noon = 212;          //temperature at noon in fahrenheit.
        double evening = 100;       //temperature during the evening in fahrenheit
        double midnight = 0;      //temperature at midnight in fahrenheit


        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
        
    }


    //Task 1: Make a function here. See the doc comments below. 
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

     
    //Task 2: Make a function here. See the doc comments below. 
    public static void printTemperatures(double fahrenheit) {
        System.out.println(fahrenheit);
        System.out.println(fahrenheitToCelsius(fahrenheit));
        System.out.println();
    }
}

/**
 * stuff
 * stuff
 * stuff
 */