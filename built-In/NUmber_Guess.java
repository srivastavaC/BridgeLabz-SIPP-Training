import java.util.Random;
import java.util.Scanner;
public class NUmber_Guess {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static Random random = new Random();

    public static int generateGuess() {
        return random.nextInt(MAX - MIN + 1) + MIN;
    }

    public static String getUserFeedback(int guess) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the number " + guess + "? (high/low/correct): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between " + MIN + " and " + MAX + ".");
        String feedback;
        int guess;

        do {
            guess = generateGuess();
            feedback = getUserFeedback(guess);

            if (feedback.equals("high")) {
                System.out.println("Too high! Trying again...");
            } else if (feedback.equals("low")) {
                System.out.println("Too low! Trying again...");
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
            } else {
                System.out.println("Invalid input. Please respond with 'high', 'low', or 'correct'.");
            }
        } while (!feedback.equals("correct"));
    }
}