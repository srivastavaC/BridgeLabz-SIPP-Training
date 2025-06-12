import java.util.Scanner;
public class UniversityDiscounInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the university Fee:");
        double universityFee = sc.nextDouble();
        System.out.println("Enter the discount percentage:");
        double discountPercentage = sc.nextDouble();
        double discountAmount = (universityFee * discountPercentage) / 100.0;
        System.out.println("Discount amount is = " + discountAmount);
        double finalFee = universityFee - discountAmount;
        System.out.println("Final fee after discount is = " + finalFee);
        sc.close();
    
    }
    
}
