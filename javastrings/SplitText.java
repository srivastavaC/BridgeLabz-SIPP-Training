package javastrings;
import java.util.Scanner;
public class SplitText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
       
        String[] userDefinedSplit = splitText(input);
        
       
        String[] builtInSplit = input.split(" ");
       
        System.out.println("\nUser-defined split result:");
        for (String word : userDefinedSplit) {
            System.out.print(word + " ");
        }
        
        System.out.println("\n\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.print(word + " ");
        }
        
       
        boolean areEqual = java.util.Arrays.equals(userDefinedSplit, builtInSplit);
        System.out.println("\n\nAre both split results equal? " + areEqual);
        
        sc.close();
    }
    
    public static String[] splitText(String str) {
        return str.split(" ");
    }
}