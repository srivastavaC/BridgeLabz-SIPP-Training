import java.util.Scanner;
public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find the longest sentence:");
        String input = sc.nextLine();
        String longestSentence = findLongestSentence(input);
        System.out.println("Longest sentence: " + longestSentence);
        sc.close();
    }

    public static String findLongestSentence(String str) {
        String[] sentences = str.split("[.!?]");
        String longest = "";

        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (sentence.length() > longest.length()) {
                longest = sentence;
            }
        }

        return longest;
    }
}