import java.util.Scanner;

public class Factors_Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        
        int[] factors = new int[count];
        int index = 0;

        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        
        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
