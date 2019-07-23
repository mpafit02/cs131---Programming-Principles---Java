import java.util.Scanner;

public class CelsiusToFahrenheit {
    
    private static Scanner scanCelsius;

	public static void main(String[] args) {
	
        System.out.println("Enter a temperature in Celsius: ");
        scanCelsius = new Scanner(System.in);
        double Fahrenheit = 0;
	
        if (scanCelsius.hasNextDouble()) {
            Fahrenheit = (scanCelsius.nextDouble()*9) / 5 + 32;
        }
        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
    }
}