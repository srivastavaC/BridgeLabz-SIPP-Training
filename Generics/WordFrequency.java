import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "apple banana apple orange banana apple mango";
        
        Map<String, Long> wordCount =
            Arrays.stream(paragraph.split(" "))
                  .collect(Collectors.groupingBy(
                      word -> word,
                      Collectors.counting()
                  ));

        System.out.println(wordCount);
    }
}
