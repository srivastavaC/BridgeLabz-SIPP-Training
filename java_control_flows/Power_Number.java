package day_1;
import java.util.Scanner;

public class Power_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int Num = sc.nextInt();
		System.out.println("Enter The Power : ");
		int Power = sc.nextInt();
		int result = 1;
		int i = 0;
		while(i<Power) {
			result*=Num;
			i++;
		}
		System.out.println("The New Number is :"+ result);
	}

}
