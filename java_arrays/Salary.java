package java_control_flows;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary : ");
		int Salary = sc.nextInt();
		System.out.println("Years Working : ");
		int Years = sc.nextInt();
		if(Years >= 5) {
			System.out.println("Deserves Bonus :" + 0.05*Salary);
		}
		else {
			System.out.println("No Bonus");
		}
	}

}
