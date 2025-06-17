package javastrings;

public class StringOutOfBound {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        try {
            
            char ch = str.charAt(20); 
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
