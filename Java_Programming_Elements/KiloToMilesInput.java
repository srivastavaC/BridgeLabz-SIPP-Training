package java_programming_elements;
import java.util.Scanner;
public class KiloToMilesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The distance in kilometers: ");
        double kilometer = sc.nextDouble();
        double miles = kilometer * 1.6;
        System.out.println("The distance in miles is: " + miles);

    }
}