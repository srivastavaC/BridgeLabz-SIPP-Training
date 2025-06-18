import java.util.Arrays;
import java.util.Scanner;

public class TwoDNum {

    
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    /
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    /
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];  

        
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        
        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int squareSum = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + squareSum);

        boolean harshad = isHarshad(number, digits);
        System.out.println("Is Harshad Number? " + harshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit: " + frequency[i][0] + " => Count: " + frequency[i][1]);
            }
        }

        sc.close();
    }
}
