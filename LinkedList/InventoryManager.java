class ItemNode {
    String name;
    int id;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManager {
    private ItemNode head = null;

    public void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int position, String name, int id, int quantity, double price) {
        if (position <= 0) return;
        if (position == 1 || head == null) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID " + id + " not found.");
    }

    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item name \"" + name + "\" not found.");
    }

    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.printf("Total Inventory Value: %.2f\n", total);
    }

    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
    }

    private ItemNode mergeSortByName(ItemNode node, boolean ascending) {
        if (node == null || node.next == null) return node;
        ItemNode middle = getMiddle(node);
        ItemNode nextToMiddle = middle.next;
        middle.next = null;
        ItemNode left = mergeSortByName(node, ascending);
        ItemNode right = mergeSortByName(nextToMiddle, ascending);
        return mergeByName(left, right, ascending);
    }

    private ItemNode mergeSortByPrice(ItemNode node, boolean ascending) {
        if (node == null || node.next == null) return node;
        ItemNode middle = getMiddle(node);
        ItemNode nextToMiddle = middle.next;
        middle.next = null;
        ItemNode left = mergeSortByPrice(node, ascending);
        ItemNode right = mergeSortByPrice(nextToMiddle, ascending);
        return mergeByPrice(left, right, ascending);
    }

    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode mergeByName(ItemNode left, ItemNode right, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;
        ItemNode result;
        if ((ascending && left.name.compareToIgnoreCase(right.name) <= 0) ||
            (!ascending && left.name.compareToIgnoreCase(right.name) > 0)) {
            result = left;
            result.next = mergeByName(left.next, right, ascending);
        } else {
            result = right;
            result.next = mergeByName(left, right.next, ascending);
        }
        return result;
    }

    private ItemNode mergeByPrice(ItemNode left, ItemNode right, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;
        ItemNode result;
        if ((ascending && left.price <= right.price) ||
            (!ascending && left.price > right.price)) {
            result = left;
            result.next = mergeByPrice(left.next, right, ascending);
        } else {
            result = right;
            result.next = mergeByPrice(left, right.next, ascending);
        }
        return result;
    }

    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private void printItem(ItemNode node) {
        System.out.println("Name: " + node.name + ", ID: " + node.id +
                ", Qty: " + node.quantity + ", Price: " + node.price);
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addAtEnd("Mouse", 101, 10, 250.0);
        manager.addAtBeginning("Keyboard", 102, 5, 450.0);
        manager.addAtPosition(2, "Monitor", 103, 3, 5000.0);
        manager.addAtEnd("Webcam", 104, 8, 1200.0);

        System.out.println("All Items:");
        manager.displayAll();

        System.out.println("\nSearch by ID:");
        manager.searchById(103);

        System.out.println("\nSearch by Name:");
        manager.searchByName("Webcam");

        System.out.println("\nTotal Inventory Value:");
        manager.calculateTotalValue();

        System.out.println("\nSort by Name Ascending:");
        manager.sortByName(true);
        manager.displayAll();

        System.out.println("\nSort by Price Descending:");
        manager.sortByPrice(false);
        manager.displayAll();

        System.out.println("\nUpdate Quantity for ID 101:");
        manager.updateQuantity(101, 20);
        manager.searchById(101);

        System.out.println("\nRemove Item ID 102:");
        manager.removeById(102);
        manager.displayAll();
    }
}
