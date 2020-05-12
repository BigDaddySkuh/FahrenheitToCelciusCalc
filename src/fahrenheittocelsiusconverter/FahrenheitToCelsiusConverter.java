package fahrenheittocelsiusconverter;

import java.util.Scanner;

/**
 * This Class Converts Fahrenheit into Celsius
 *
 * @author Mark Carreira
 */
public class FahrenheitToCelsiusConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to the fahrenheit to celcius calculator!");
        System.out.println("Please enter a numeric value to change from fahrenheit into celsius degrees.");

        //Get user input 
        Scanner input = new Scanner(System.in);

        //Temperature conversion
        double fahrenheit = input.nextDouble();
        double celcius = (5.0 / 9) * (fahrenheit - 32);

        //Finishing message
        System.out.println("You have entered " + fahrenheit + ".  Your converted value is " + celcius + " degrees.");
    }

}
