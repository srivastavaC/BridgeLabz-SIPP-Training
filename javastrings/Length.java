package javastrings;

public class Length {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        int userDefinedLength = getStringLength(input);
        int builtInLength = input.length();
        
        System.out.println("User-defined length: " + userDefinedLength);
        System.out.println("Built-in length: " + builtInLength);
        
        if (userDefinedLength == builtInLength) {
            System.out.println("Both lengths are equal.");
        } else {
            System.out.println("Lengths are different.");
        }
        
        scanner.close();
    }
    
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when trying to access an index that doesn't exist
        }
        return count;
    }
    
}
