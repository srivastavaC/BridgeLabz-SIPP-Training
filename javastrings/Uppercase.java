package javastrings;

public class Uppercase {
   
    public static void main(String[] args) {
        String originalText = "Hello, World!";
        
       
        String upperText = originalText.toUpperCase();
        
       
        System.out.println("Original Text: " + originalText);
        System.out.println("Uppercase Text: " + upperText);
        
        
        if (originalText.equals(upperText)) {
            System.out.println("The texts are the same.");
        } else {
            System.out.println("The texts are different.");
        }
    }
    
}
