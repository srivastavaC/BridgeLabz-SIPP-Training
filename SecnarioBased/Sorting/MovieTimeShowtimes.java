import java.util.*;

public class MovieTimeShowtimes {

    
    public static void insertionSort(String[] times) {
        for (int i = 1; i < times.length; i++) {
            String key = times[i];
            int j = i - 1;

           
            while (j >= 0 && times[j].compareTo(key) > 0) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] showtimes = {
            "13:30", "09:45", "11:15", "15:00", "10:00", "14:20"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(showtimes));

        insertionSort(showtimes);

        System.out.println("\nAfter Sorting (Showtimes in order):");
        for (String time : showtimes) {
            System.out.println(time);
        }
    }
}
