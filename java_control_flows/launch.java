package java_control_flows;
import java.util.Scanner;

public class launch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Start = sc.nextInt();
		for (int i = Start; i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("Launch");
	}

}
