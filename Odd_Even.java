import java.util.ArrayList;
import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Number :");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		if (num < 1) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }
	    ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        
        System.out.println("\nEven Numbers:");
        for (int evenNum : evenList) {
            System.out.print(evenNum + " ");
        }

        
        System.out.println("\n\nOdd Numbers:");
        for (int oddNum : oddList) {
            System.out.print(oddNum + " ");
        }
    }

	}
