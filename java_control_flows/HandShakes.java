package day_1;
import java.util.Scanner;
public class HandShakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int N = sc.nextInt();
		int max = (N*(N-1))/2;
		System.out.println("Maximum Handshake is : " + max);
	}

}
