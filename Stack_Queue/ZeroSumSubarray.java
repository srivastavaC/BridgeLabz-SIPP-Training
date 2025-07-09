import java.util.*;

public class ZeroSumSubarray{
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int currSum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (map.containsKey(currSum)) {
                for (int startIndex : map.get(currSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            map.putIfAbsent(currSum, new ArrayList<>());
            map.get(currSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        for (int[] range : subarrays) {
            System.out.println("Subarray: [" + range[0] + ", " + range[1] + "]");
        }
    }
}
