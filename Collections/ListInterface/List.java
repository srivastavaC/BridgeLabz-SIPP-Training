import java.util.*;

public class List {

    public static <T> void reverseArrayList(ArrayList<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
