package java_control_flows;
import java.time.LocalDate;
import java.util.*;
public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter day (1-31): ");
	        int day = sc.nextInt();

	        System.out.print("Enter month (1-12): ");
	        int month = sc.nextInt();

	        System.out.print("Enter year (e.g. 2025): ");
	        int year = sc.nextInt();

	        try {
	            LocalDate date = LocalDate.of(year, month, day);
	            java.time.DayOfWeek dow = date.getDayOfWeek(); 

	            System.out.println("The day of the week is: " + dow);
	        } catch (Exception e) {
	            System.out.println("Invalid date entered. Please check day, month, and year.");
	        }

	}

}
