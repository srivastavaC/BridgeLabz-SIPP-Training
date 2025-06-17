package java_control_flows;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number to find its factors: ");
	        int number = sc.nextInt();

	        System.out.println("Factors of " + number + " are:");

	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                System.out.println(i);
	            }
	        }

	}

}
