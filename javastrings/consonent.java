package javastrings;

public class consonent {

    public static void main(String[] args) {
        String input = "Hello, World!";
        String[][] result = findVowelsAndConsonants(input);
        displayResult(result);
    }

    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    public static String checkCharacterType(char ch) {
        if (Character.isLetter(ch)) {
            char lowerCh = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lowerCh) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s%n", "Character", "Type");
        System.out.println("-----------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }
    
}
