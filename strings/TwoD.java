package javastrings;

public class TwoD {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String[] wordsArray = splitText(input);
        String[][] wordsWithLength = getWordsWithLength(wordsArray);
        
        System.out.println("\nWords and their lengths:");
        System.out.printf("%-20s %s%n", "Word", "Length");
        System.out.println("-------------------------------");
        
        for (String[] wordInfo : wordsWithLength) {
            System.out.printf("%-20s %d%n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }
        
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
                    word.setLength(0);
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
    
}
