public class SentenceSearch {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The sun rises in the east.",
            "Java is a popular programming language.",
            "Linear search is simple and easy to implement.",
            "Always stay curious and keep learning."
        };

        String word = "search";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }
}
