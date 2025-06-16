package java_control_flows;
import java.util.Scanner;

public class n_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		if(n>=0) {
			System.out.println("Natural Number");
		}
		else {
			System.out.println("Not Natural");
		}

        int sumWhile = 0;
        int i = 1;

        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("✅ Both computations are correct and match!");
        } else {
            System.out.println("❌ There is a mismatch in the results.");
        }

	}

}
