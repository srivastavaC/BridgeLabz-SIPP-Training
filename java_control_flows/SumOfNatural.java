package java_control_flows;
import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Number is Natural : ");
		}
		else {
			System.out.println("Not a natural number : ");
		}
		System.out.println("Enter The Numbers :");
		int nums = sc.nextInt();
		int a = nums*(nums+1)/2;
		System.out.println("The Sum is: "+a);
		
		

	}

}
