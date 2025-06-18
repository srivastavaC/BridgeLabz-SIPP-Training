import java.util.Arrays;
import java.util.Random;    
public class FourDigit {
    
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000); // Generates a 4-digit number
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; 
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        double[] results = findAverageMinMax(randomNumbers);
        
        System.out.printf("Average: %.2f, Min: %d, Max: %d%n", results[0], (int)results[1], (int)results[2]);
    }
}