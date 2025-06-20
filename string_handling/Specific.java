import java.util.Scanner;
public class Specific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter characters to remove (without spaces):");
        String charsToRemove = sc.nextLine();
        
        String result = removeSpecificCharacters(input, charsToRemove);
        System.out.println("String after removing specified characters: " + result);
        
        sc.close();
    }

    public static String removeSpecificCharacters(String str, String charsToRemove) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (charsToRemove.indexOf(c) == -1) { 
                result.append(c);
            }
        }
        return result.toString();
    }
}