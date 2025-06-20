import java.util.Scanner;
import java.util.Arrays;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        boolean isHarshad = isHarshad(number, digits);
        int[][] frequency = digitFrequency(digits);
        int count = digits.length;

        System.out.println("Number of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad number: " + isHarshad);

        System.out.println("Digit Frequency:");
        for (int[] freq : frequency) {
            System.out.println(freq[0] + ": " + freq[1]);
        }

        sc.close();
    }

   
    static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d * d;
        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }
}