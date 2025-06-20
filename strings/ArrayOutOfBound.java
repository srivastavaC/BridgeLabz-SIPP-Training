package javastrings;

public class ArrayOutOfBound {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            
            int number = numbers[10]; 
            System.out.println("Number at index 10: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
    
}
