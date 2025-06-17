package java_control_flows;
import java.util.*;

public class IntOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value1: ");
		int a = sc.nextInt();
		System.out.println("Enter The Value2: ");
		int b = sc.nextInt();
		System.out.println("Enter The Value3: ");
		int c = sc.nextInt();

		int result1 = a + b * c;
		int result2 = a * b + c;
		int result3 = c + a / b;
		int result4 = a % b + c;

		System.out.println("a + b * c = " + result1);
		System.out.println("a * b + c = " + result2);
		System.out.println("c + a / b = " + result3);
		System.out.println("a % b + c = " + result4);
	}
}