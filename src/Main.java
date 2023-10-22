// Import the Scanner class
import java.util.Scanner;

class FahrenheitToCelsius {

    public static void main (String [] args){
        //Defines the variable as a float data type
        float Celsius;

        //Scanner Object to receive user input
        Scanner myTemp = new Scanner(System.in);
        System.out.println("Enter current temperature in Fahrenheit.");

        //Read user input
        float Fahrenheit = myTemp.nextFloat();
        //Calculate Fahrenheit to Celsius
        Celsius = ((Fahrenheit-32)*5)/9;

        //Output result
        System.out.println("Current temperature in celsius is: "+ Celsius);
    }
}