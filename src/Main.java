import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the temperature using both wind speed  and wind chill index ");
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = input.nextDouble();

        System.out.println("Enter the wind speed (>=2): ");
        double windSpeed = input.nextDouble();

        System.out.println("The actual temperature is then = " + (35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16)));
    }
}
