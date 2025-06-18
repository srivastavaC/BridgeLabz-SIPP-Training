import java.util.Scanner;

public class FiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

       
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            
            if (numbers[i] > 0) {
                System.out.print("It is a positive number");
                
                if (numbers[i] % 2 == 0) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("It is a negative number.");
            } else {
                System.out.println("It is zero.");
            }
        }

        
        int first = numbers[0];
        int last = numbers[4];

        System.out.print("\nComparison between first and last elements: ");
        if (first == last) {
            System.out.println("They are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}
