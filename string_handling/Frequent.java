import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Frequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find the most frequent character:");
        String input = sc.nextLine();
        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most frequent character: " + mostFrequentChar);
        sc.close();
    }

    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}