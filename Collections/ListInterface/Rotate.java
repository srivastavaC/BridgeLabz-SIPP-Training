import java.util.ArrayList;
import java.util.List;

public class Rotate {
    public static <T> void rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;
        List<T> temp = new ArrayList<>();
        temp.addAll(list.subList(k, n));
        temp.addAll(list.subList(0, k));
        list.clear();
        list.addAll(temp);
    }
}
