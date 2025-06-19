import java.util.Scanner;
public class TempConvert {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsiusFromFahrenheit = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is " + celsiusFromFahrenheit + "°C");

        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheitFromCelsius = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is " + fahrenheitFromCelsius + "°F");
        
        scanner.close();
    }
}