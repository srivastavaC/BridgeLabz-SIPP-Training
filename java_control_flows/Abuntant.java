package java_control_flows;
import java.util.Scanner;

public class Abuntant {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number to check if it's Abundant: ");
	        int number = sc.nextInt();

	        int sum = 0;

	        // Find proper divisors and sum them
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        // Check if it's an abundant number
	        if (sum > number) {
	            System.out.println(number + " is an Abundant Number.");
	        } else {
	            System.out.println(number + " is NOT an Abundant Number.");
	        }
	}
}
