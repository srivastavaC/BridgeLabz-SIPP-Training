import java.time.LocalDate;
import java.util.Scanner;

public class Arthemetic {
    public static int calculateDayOfWeek(int m, int y) {
        m += 12;
        y -= 1;
        return (1 + (13 * m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
    }
}