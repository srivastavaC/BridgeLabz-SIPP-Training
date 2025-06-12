import java.util.Scanner;
public class N_HandShake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int N = sc.nextInt();
		int max = (N*(N-1))/2;
		System.out.println("Maximum Handshake is : " + max);
	}

}
