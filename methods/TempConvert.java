import java.util.Scanner;
public class TempConvert {
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

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit to convert to Celsius:");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        
        System.out.println("Enter Celsius to convert to Fahrenheit:");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        
        System.out.println("Enter pounds to convert to kilograms:");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        
        System.out.println("Enter kilograms to convert to pounds:");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        
        System.out.println("Enter gallons to convert to liters:");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        
        System.out.println("Enter liters to convert to gallons:");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
        
        sc.close();
    }
}