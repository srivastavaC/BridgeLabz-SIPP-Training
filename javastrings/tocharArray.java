package javastrings;

public class tocharArray {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        // Using user-defined method
        char[] userDefinedArray = toCharArray(input);
        
        // Using built-in method
        char[] builtInArray = input.toCharArray();
        
        // Display results
        System.out.println("User-defined toCharArray result: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        
        System.out.println("\nBuilt-in toCharArray result: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        
        // Compare results
        boolean areEqual = java.util.Arrays.equals(userDefinedArray, builtInArray);
        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }

    public static char[] toCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
}
