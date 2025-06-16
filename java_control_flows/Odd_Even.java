package day_1;
import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();

	        if (number < 1) {
	            System.out.println("Please enter a number greater than or equal to 1.");
	        } else {
	            System.out.println("Even numbers between 1 and " + number + ":");
	            for (int i = 1; i <= number; i++) {
	                if (i % 2 == 0) {
	                    System.out.print(i + " ");
	                }
	            }

	            System.out.println("\nOdd numbers between 1 and " + number + ":");
	            for (int i = 1; i <= number; i++) {
	                if (i % 2 != 0) {
	                    System.out.print(i + " ");
	                }
	            }
	        }

	}

}
