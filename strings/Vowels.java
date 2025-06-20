package javastrings;

public class Vowels {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    }
    
}
