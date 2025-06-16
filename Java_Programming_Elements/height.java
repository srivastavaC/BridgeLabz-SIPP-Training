package java_programming_elements;
import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in centimeters: "); 
        double heightInCm = sc.nextDouble();
        double heightInFeet = heightInCm / 30.48;
        double heightInInches = (heightInCm % 30.48) / 2.54;
        System.out.printf("Your height is: %.2f feet and %.2f inches%n", heightInFeet, heightInInches);
    }
    
}
