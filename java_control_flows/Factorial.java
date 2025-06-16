package day_1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer: ");
	        int n = sc.nextInt();

	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            int fact = 1;
	            int i = 1;

	            while (i <= n) {
	                fact *= i;
	                i++;
	            }

	            System.out.println("Factorial of " + n + " is: " + fact);
	        }


	}

}
