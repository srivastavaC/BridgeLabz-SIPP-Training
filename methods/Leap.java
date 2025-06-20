import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = sc.nextInt();
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                return year % 400 == 0; 
            }
            return true; 
        }
        return false;
    }
}
