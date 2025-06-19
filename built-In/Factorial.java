import java.util.Scanner;
public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers do not have a factorial.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        
        try {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}