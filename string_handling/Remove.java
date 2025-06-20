
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicate characters:");
        String input = sc.nextLine();
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; 

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        return result.toString();
    }
}