import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = sc.nextInt();
        
        int sum = calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}