import java.util.Scanner;
public class MaxOfThree {

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
        
        scanner.close();
    }
}