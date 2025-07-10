public class findRotationIndex {
    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};
        int index = findRotationIndex(rotatedArray);
        System.out.println("Index of the smallest element (rotation point): " + index);
        System.out.println("Smallest element: " + rotatedArray[index]);
    }
}
