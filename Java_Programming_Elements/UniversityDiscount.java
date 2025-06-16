package java_programming_elements;
public class UniversityDiscount{
    public static void main(String[] args){
        int fee = 125000;
        int discountPercentage = 10;
        double discountAmount = (fee * discountPercentage)/100.0;
        double finalFee = fee - discountAmount;
        System.out.println("discount amount is = " + discountAmount);
        System.out.println("Final fee after discount is = " + finalFee); 
    }
    
}
