import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Amount :");
        double principal = sc.nextDouble();
        System.out.println("Enter The Rate of Interest :");
        double rate = sc.nextDouble();
        System.out.println("Enter The Time Period :");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
