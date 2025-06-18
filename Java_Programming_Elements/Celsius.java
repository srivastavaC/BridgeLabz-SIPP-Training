
public class Celsius {
    public static void main(String[] args) {
        double celsius = 25.0; // Example temperature in Celsius
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}