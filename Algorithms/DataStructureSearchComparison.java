
import java.util.*;

public class DataStructureSearchComparison {
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean hashSetSearch(Set<Integer> set, int target) {
        return set.contains(target);
    }

    public static boolean treeSetSearch(TreeSet<Integer> treeSet, int target) {
        return treeSet.contains(target);
    }
}
