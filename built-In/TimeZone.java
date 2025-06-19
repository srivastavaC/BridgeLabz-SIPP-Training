import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeZone {
    public static void main(String[] args) {
        
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
    }
}