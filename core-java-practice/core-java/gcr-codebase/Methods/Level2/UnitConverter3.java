import java.util.Scanner;

public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();

        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();

        System.out.println("\n===== Conversions =====");

        System.out.println(fahrenheit + " °F = "
                + convertFahrenheitToCelsius(fahrenheit) + " °C");

        System.out.println(celsius + " °C = "
                + convertCelsiusToFahrenheit(celsius) + " °F");

        System.out.println(pounds + " pounds = "
                + convertPoundsToKilograms(pounds) + " kg");

        System.out.println(kilograms + " kg = "
                + convertKilogramsToPounds(kilograms) + " pounds");

        System.out.println(gallons + " gallons = "
                + convertGallonsToLiters(gallons) + " liters");

        System.out.println(liters + " liters = "
                + convertLitersToGallons(liters) + " gallons");
    }
}