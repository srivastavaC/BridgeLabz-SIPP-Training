import java.util.Scanner;
public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();
        System.out.println("Enter day (1-31):");
        int day = sc.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        sc.close();
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) {
            return true; 
        } else if (month == 4 || month == 5) {
            return true; 
        } else if (month == 6 && day <= 20) {
            return true; 
        }
        return false; 
    }
}