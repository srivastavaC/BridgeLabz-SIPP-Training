package javastrings;

public class NumberExceptionFormat {public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            
            String invalidNumber = "abc123";
            
            
            int num = Integer.parseInt(invalidNumber);
            
            
            System.out.println("Converted Number: " + num);
            
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}

    
}
