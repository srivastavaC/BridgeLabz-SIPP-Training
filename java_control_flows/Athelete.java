package java_control_flows;
import java.util.Scanner;

public class Athelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side1: ");
		int a = sc.nextInt();
		System.out.println("Enter the side2: ");
		int b = sc.nextInt();
		System.out.println("Enter the side3: ");
		int c = sc.nextInt();
		System.out.println("Enter the distance: ");
		int d = sc.nextInt();
		int DistanceCovered=(d*1000)/(a+b+c);
		System.out.println("The rounds are : "+ DistanceCovered);
		
	}

}
