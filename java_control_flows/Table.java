package java_control_flows;
import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (between 6 and 9): ");
	        int num = sc.nextInt();

	        if (num >= 6 && num <= 9) {
	            System.out.println("Multiplication table of " + num + ":");
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(num + " x " + i + " = " + (num * i));
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a number between 6 and 9.");
	        }
	}

}
