package javastrings;
import java.util.Scanner;

public class LowerCase {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        
        String lower1 = text1.toLowerCase();
        String lower2 = text2.toLowerCase();

        
        System.out.println("\nLowercase First Text: " + lower1);
        System.out.println("Lowercase Second Text: " + lower2);

        
        if (lower1.equals(lower2)) {
            System.out.println("\nBoth texts are equal (case-insensitive comparison).");
        } else {
            System.out.println("\nTexts are different.");
        }

        sc.close();
    }
}
