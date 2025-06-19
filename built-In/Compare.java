import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDate + " is before " + secondDate);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println(firstDate + " is after " + secondDate);
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println(firstDate + " is the same as " + secondDate);
        }
    }
}