import java.util.Scanner;
public class Calendar {
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1-12):");
        int month = sc.nextInt();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }

    public static void printCalendar(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        System.out.println("Calendar for " + months[month - 1] + " " + year);
        
        
        if (month == 2 && isLeapYear(year)) {
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < 29; i++) {
                System.out.printf("%3d ", i + 1);
                if ((i + getFirstDayOfMonth(month, year)) % 7 == 6) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < daysInMonth[month - 1]; i++) {
                System.out.printf("%3d ", i + 1);
                if ((i + getFirstDayOfMonth(month, year)) % 7 == 6) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}