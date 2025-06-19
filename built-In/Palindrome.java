import java.util.Scanner;
public class Palindrome {

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}