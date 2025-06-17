
package javastrings;
import java.util.Scanner;
public class CharAt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.print("Enter the starting index for substring: ");
        int startIndex = sc.nextInt();
        
        System.out.print("Enter the ending index for substring: ");
        int endIndex = sc.nextInt();
        
        
        StringBuilder charAtSubstring = new StringBuilder();
        for (int i = startIndex; i < endIndex && i < input.length(); i++) {
            charAtSubstring.append(input.charAt(i));
        }
        
        
        String substringMethod = input.substring(startIndex, Math.min(endIndex, input.length()));
        
      
        System.out.println("\nSubstring using charAt(): " + charAtSubstring.toString());
        System.out.println("Substring using substring(): " + substringMethod);
        
        
        if (charAtSubstring.toString().equals(substringMethod)) {
            System.out.println("\nBoth substrings are equal.");
        } else {
            System.out.println("\nSubstrings are different.");
        }
        
        sc.close();
    }
}