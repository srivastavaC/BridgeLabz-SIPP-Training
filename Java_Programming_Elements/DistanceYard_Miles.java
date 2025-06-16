package java_programming_elements;
import java.util.Scanner;
public class DistanceYard_Miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = feet / 5280;
        System.out.printf("The distance in yards is: %.2f yards%n", yards);
        System.out.printf("The distance in miles is: %.2f miles%n", miles);
    }

    
}
