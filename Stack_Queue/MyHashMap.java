class MyHashMap {
    private static class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new Node(-1, -1);
        }

        Node prev = find(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = hash(key);
        if (buckets[index] == null) return -1;

        Node prev = find(buckets[index], key);
        if (prev.next == null) return -1;
        return prev.next.value;
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] == null) return;

        Node prev = find(buckets[index], key);
        if (prev.next == null) return;
        prev.next = prev.next.next;
    }

    private Node find(Node head, int key) {
        Node curr = head, prev = null;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(1001, 30);
        System.out.println(map.get(1));
        System.out.println(map.get(1001));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
