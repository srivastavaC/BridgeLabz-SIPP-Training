//write code for calculating the volume of a cylinder
import java.util.Scanner;       
public class CylinderVol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
        scanner.close();
    }
}