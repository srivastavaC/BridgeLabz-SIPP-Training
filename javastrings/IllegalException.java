package javastrings;

public class IllegalException {
   
    public static void main(String[] args) {
        try {
           
            int age = -5; 
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative: " + age);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
    
}
