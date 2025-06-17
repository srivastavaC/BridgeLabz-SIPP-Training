//Write a program to split the text into words, compare the result with the split() method, and display the result
package javastrings;
import java.util.Scanner;
public class SplitText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        // Using user-defined split method
        String[] userDefinedSplit = splitText(input);
        
        // Using built-in split method
        String[] builtInSplit = input.split(" ");
        
        // Display results
        System.out.println("\nUser-defined split result:");
        for (String word : userDefinedSplit) {
            System.out.print(word + " ");
        }
        
        System.out.println("\n\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.print(word + " ");
        }
        
        // Compare results
        boolean areEqual = java.util.Arrays.equals(userDefinedSplit, builtInSplit);
        System.out.println("\n\nAre both split results equal? " + areEqual);
        
        sc.close();
    }
    
    public static String[] splitText(String str) {
        return str.split(" ");
    }
}