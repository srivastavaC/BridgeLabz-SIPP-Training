package javastrings;

public class Charr {
    public static void main(String[] args) {
        String input = "   Hello, World!   ";
        
        
        int[] trimmedIndices = trimSpaces(input);
        String trimmedString = substringUsingCharAt(input, trimmedIndices[0], trimmedIndices[1]);
        
       
        String builtInTrimmedString = input.trim();
        
        
        boolean areEqual = compareStringsUsingCharAt(trimmedString, builtInTrimmedString);
        
      
        System.out.println("Trimmed string using charAt(): '" + trimmedString + "'");
        System.out.println("Trimmed string using built-in trim(): '" + builtInTrimmedString + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }

    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1}; 
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
}
