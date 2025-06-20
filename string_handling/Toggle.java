import java.util.Scanner;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to toggle case:");
        String input = sc.nextLine();
        String toggled = toggleCase(input);
        System.out.println("Toggled case string: " + toggled);
        sc.close();
    }

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); 
            }
        }

        return toggledString.toString();
    }
}