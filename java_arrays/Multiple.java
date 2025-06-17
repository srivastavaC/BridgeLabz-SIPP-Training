package java_control_flows;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its multiples below 100: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            int i = 1;
            System.out.println("Multiples of " + number + " below 100 are:");
            while (number * i < 100) {
                System.out.println(number * i);
                i++;
            }
        }

	}

}
