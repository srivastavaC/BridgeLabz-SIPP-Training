package java_control_flows;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("Yes");
		}
		else if(age<18) {
			System.out.println("No");
		}

	}

}
