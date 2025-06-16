package day_1;
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();

	        if (number <= 0) {
	            System.out.println("Please enter a valid positive integer.");
	        } else {
	            int i = 1;
	            while (i <= number) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println("FizzBuzz");
	                } else if (i % 3 == 0) {
	                    System.out.println("Fizz");
	                } else if (i % 5 == 0) {
	                    System.out.println("Buzz");
	                } else {
	                    System.out.println(i);
	                }
	                i++;
	            }
	        }

	}

}
