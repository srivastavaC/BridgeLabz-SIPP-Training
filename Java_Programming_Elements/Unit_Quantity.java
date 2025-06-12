import java.util.Scanner;
public class Unit_Quantity {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Unit Price: ");
    int unitprice = sc.nextInt();
    System.out.println("Enter the Quantity: ");
    int Quantity = sc.nextInt();
    int total = unitprice * Quantity;
    System.out.println("The total price is: " + total);
    }
    
}
