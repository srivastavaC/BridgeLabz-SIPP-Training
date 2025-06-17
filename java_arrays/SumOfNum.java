import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum =0;
		double[] num = new double[10];
		while(true) {
			System.out.println("Enter The Numbers : ");
			num[i] = sc.nextDouble();
			if(num[i] <= 0.0) {
				break;
			}
			else {
				sum+=num[i];
				
				i++;
			}
		
		}
		System.out.println(sum);

	}

}
