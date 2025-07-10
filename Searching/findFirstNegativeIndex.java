public class FirstNegativeSearch {
    public static int findFirstNegativeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, -5, 9, -3};
        int index = findFirstNegativeIndex(numbers);
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
