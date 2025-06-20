package javastrings;

public class words {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String[] wordsArray = splitText(input);
        String[][] wordsWithLength = getWordsWithLength(wordsArray);
        
        int[] shortestAndLongest = findShortestAndLongest(wordsWithLength);
        
        System.out.println("Shortest word: " + wordsWithLength[shortestAndLongest[0]][0]);
        System.out.println("Longest word: " + wordsWithLength[shortestAndLongest[1]][0]);
        
        scanner.close();
    }
    
    public static String[] splitText(String str) {
        java.util.ArrayList<String> wordsList = new java.util.ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    wordsList.add(word.toString());
                    word.setLength(0); // Reset the word
                }
            } else {
                word.append(c);
            }
        }
        
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }
        
        return wordsList.toArray(new String[0]);
    }
    
    public static int getStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }
    
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        
        return result;
    }
    
    public static int[] findShortestAndLongest(String[][] wordsWithLength) {
        int shortestIndex = 0;
        int longestIndex = 0;
        
        for (int i = 1; i < wordsWithLength.length; i++) {
            if (Integer.parseInt(wordsWithLength[i][1]) < Integer.parseInt(wordsWithLength[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (Integer.parseInt(wordsWithLength[i][1]) > Integer.parseInt(wordsWithLength[longestIndex][1])) {
                longestIndex = i;
            }
        }
        return new int[] {shortestIndex, longestIndex};
    }
}
