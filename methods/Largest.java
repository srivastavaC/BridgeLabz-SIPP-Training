import java.util.Scanner;
public class Largest {
    int a, b, c;

    public void findLargest() {
        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Largest obj = new Largest();
        System.out.println("Enter the first number:");
        obj.a = sc.nextInt();
        System.out.println("Enter the second number:");
        obj.b = sc.nextInt();
        System.out.println("Enter the third number:");
        obj.c = sc.nextInt();
        obj.findLargest();
        sc.close();
    }
}
