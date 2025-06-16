package day_1;
import java.util.Scanner;

public class SIMPLEINTEREST {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle: ");
	int a = sc.nextInt();
	System.out.println("Enter the rate: ");
	int b = sc.nextInt();
	System.out.println("Enter the time: ");
	int c = sc.nextInt();
	int SI = a*b*c/100;
	System.out.println("The SimpleInterest is: " + SI);
	
	}
}
