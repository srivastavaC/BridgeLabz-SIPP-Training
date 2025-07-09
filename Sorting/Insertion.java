import java.util.Arrays;

public class Insertion {

    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 109, 101, 107};
        System.out.println("Before sorting: " + Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("After sorting: " + Arrays.toString(employeeIDs));
    }
}
