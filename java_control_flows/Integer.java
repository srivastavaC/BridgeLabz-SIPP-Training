package java_control_flows;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        int count = 0;
	        int temp = Math.abs(number); 

	        if (temp == 0) {
	            count = 1;
	        } else {
	            while (temp > 0) {
	                temp = temp / 10;
	                count++;
	            }
	        }

	        System.out.println("Number of digits in " + number + " is: " + count);
	}

}
