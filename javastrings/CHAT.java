package javastrings;

public class CHAT {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        
        boolean areEqualUsingCharAt = compareStringsUsingCharAt(str1, str2);
        boolean areEqualUsingEquals = str1.equals(str2);
        
        System.out.println("Comparison using charAt(): " + areEqualUsingCharAt);
        System.out.println("Comparison using equals(): " + areEqualUsingEquals);
        
        if (areEqualUsingCharAt == areEqualUsingEquals) {
            System.out.println("Both methods yield the same result.");
        } else {
            System.out.println("Methods yield different results.");
        }
        
        scanner.close();
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
