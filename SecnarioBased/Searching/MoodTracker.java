import java.time.LocalDate;
import java.util.*;

public class MoodTracker {
    private HashMap<LocalDate, List<String>> moodLog = new HashMap<>();

    public void logMood(LocalDate date, String mood) {
        moodLog.putIfAbsent(date, new ArrayList<>());
        moodLog.get(date).add(mood);
        System.out.println("Mood logged.");
    }

    public void searchMood(String mood) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusDays(30);
        int count = 0;
        List<LocalDate> dates = new ArrayList<>();

        for (LocalDate date : moodLog.keySet()) {
            if (!date.isBefore(startDate) && !date.isAfter(today)) {
                for (String m : moodLog.get(date)) {
                    if (m.equalsIgnoreCase(mood)) {
                        count++;
                        dates.add(date);
                    }
                }
            }
        }

        System.out.println("Mood '" + mood + "' occurred " + count + " time(s) in the last 30 days.");
        if (!dates.isEmpty()) {
            System.out.println("Dates with this mood:");
            for (LocalDate d : dates) {
                System.out.println(" - " + d);
            }
        }
    }

    public void displayAllLogs() {
        for (Map.Entry<LocalDate, List<String>> entry : moodLog.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MoodTracker tracker = new MoodTracker();
        tracker.logMood(LocalDate.now().minusDays(1), "happy");
        tracker.logMood(LocalDate.now().minusDays(3), "sad");
        tracker.logMood(LocalDate.now().minusDays(5), "tired");
        tracker.logMood(LocalDate.now().minusDays(1), "happy");

        System.out.println("\n--- Searching for mood 'happy' ---");
        tracker.searchMood("happy");

        System.out.println("\n--- All Mood Logs ---");
        tracker.displayAllLogs();
    }
}
