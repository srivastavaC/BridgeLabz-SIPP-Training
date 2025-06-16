package day_1;
import java.util.Scanner;
public class Check_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("0");
		}
		

	}

}
