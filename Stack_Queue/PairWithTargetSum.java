import java.util.*;

public class PairWithTargetSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean result = hasPairWithSum(arr, target);
        System.out.println("Pair with target sum exists: " + result);
    }
}
