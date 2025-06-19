import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Date {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        
        String formattedDate1 = currentDate.format(format1);
        String formattedDate2 = currentDate.format(format2);
        String formattedDate3 = currentDate.format(format3);

        System.out.println("Current date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Current date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}