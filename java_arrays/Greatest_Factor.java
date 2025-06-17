package java_control_flows;
import java.util.Scanner;

public class Greatest_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its greatest factor (excluding itself): ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("No proper factor exists for numbers <= 1.");
        } else {
            int i = number - 1;
            while (i >= 1) {
                if (number % i == 0) {
                    System.out.println("The greatest factor of " + number + " (excluding itself) is: " + i);
                    break; // stop at the first (greatest) factor found
                }
                i--;
            }
        }


	}

}
