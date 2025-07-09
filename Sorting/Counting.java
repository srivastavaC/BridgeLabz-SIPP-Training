import java.util.Arrays;

public class Counting {

    public static void countingSort(int[] ages) {
        int max = Arrays.stream(ages).max().getAsInt();
        int min = Arrays.stream(ages).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages)
            count[age - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        for (int i = 0; i < ages.length; i++)
            ages[i] = output[i];
    }

    public static void main(String[] args) {
        int[] studentAges = {16, 18, 17, 15, 16, 19, 17};
        System.out.println("Before sorting: " + Arrays.toString(studentAges));
        countingSort(studentAges);
        System.out.println("After sorting: " + Arrays.toString(studentAges));
    }
}
