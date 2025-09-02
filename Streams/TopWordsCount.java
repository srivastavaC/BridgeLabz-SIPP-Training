import java.io.*;
import java.util.*;

public class TopWordsCount {
    public static void main(String[] args) {
        String filePath = "input.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Words: " + totalWords);
        System.out.println("Top 5 Most Frequent Words:");

        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
