import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        System.out.println("Enter the substring to count:");
        String subString = sc.nextLine();
        
        int count = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' occurs " + count + " times in the main string.");
        
        sc.close();
    }

    public static int countSubstringOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); 
        }

        return count;
    }
}