package day_1;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int sum = 0;
	        int number;

	        System.out.println("Enter numbers to sum (enter 0 to stop):");

	        while (true) {
	            number = sc.nextInt();
	            if (number == 0) {
	                break;
	            }
	            sum += number;
	        }

	        System.out.println("The total sum is: " + sum);

	}

}
