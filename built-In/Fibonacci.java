import java.util.Scanner;
public class Fibonacci {
    
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = sc.nextInt();
        
        generateFibonacci(terms);
        
        sc.close();
    }
}