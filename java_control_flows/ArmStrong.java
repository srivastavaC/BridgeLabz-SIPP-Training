package java_control_flows;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);


	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int originalNumber = number; 
	        int temp = number;
	        int sum = 0;

	        
	        int digitCount = 0;
	        while (temp != 0) {
	            temp /= 10;
	            digitCount++;
	        }

	       
	        temp = number;

	        
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digitCount); // e.g., 5^3
	            temp /= 10;
	        }

	        
	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is NOT an Armstrong number.");
	        }

	}

}
