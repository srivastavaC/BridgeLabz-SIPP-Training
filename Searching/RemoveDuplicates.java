import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "programming";
        String result = removeDuplicates(original);
        System.out.println("Original: " + original);
        System.out.println("Without Duplicates: " + result);
    }
}
