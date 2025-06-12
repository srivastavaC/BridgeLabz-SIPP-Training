import java.util.Scanner;
public class Profit_Or_Loss {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the item: ");
        double CostPrice = sc.nextDouble();
        System.out.println("Enter the selling price of the item: ");
        double SellingPrice = sc.nextDouble();
        if(CostPrice>SellingPrice){
            double Loss = CostPrice - SellingPrice;
            Double LossPercentage = (Loss / CostPrice) * 100;
            System.out.println("Loss Percentage is = " + LossPercentage + "%");
            System.out.println("Loss is = " + Loss);
        }
        else if(SellingPrice>CostPrice){
            Double profit = SellingPrice - CostPrice;
           Double profitPercentage = (profit / CostPrice) * 100;
            System.out.println("Profit Percentage is = " + profitPercentage + "%");
            System.out.println("Prfoit is = " + profit);
        }
        else if (CostPrice == SellingPrice) {
            System.out.println("No Profit No Loss");
        } else {
            System.out.println("Invalid input. Please enter valid cost and selling prices.");
        }
    }
    
}
