import java.util.*;

public class LostAndFoundSystem {
    private HashMap<String, LinkedList<String>> itemMap = new HashMap<>();
    private HashSet<String> itemSet = new HashSet<>();

    public void addItem(String category, String description) {
        if (itemSet.contains(description)) {
            System.out.println("Duplicate item. Not adding: " + description);
            return;
        }

        itemMap.putIfAbsent(category, new LinkedList<>());
        itemMap.get(category).add(description);
        itemSet.add(description);
        System.out.println("Item added successfully.");
    }

    public void searchItem(String keyword) {
        boolean found = false;
        for (Map.Entry<String, LinkedList<String>> entry : itemMap.entrySet()) {
            String category = entry.getKey();
            LinkedList<String> items = entry.getValue();

            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Item found in category [" + category + "] at position " + i + ": " + items.get(i));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No item found matching keyword: " + keyword);
        }
    }

    public void displayAllItems() {
        for (Map.Entry<String, LinkedList<String>> entry : itemMap.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("  - " + item);
            }
        }
    }

    public static void main(String[] args) {
        LostAndFoundSystem system = new LostAndFoundSystem();

        system.addItem("Mobile", "Red iPhone 13");
        system.addItem("Bag", "Blue Adidas backpack");
        system.addItem("Book", "Java Programming Book by XYZ");
        system.addItem("Mobile", "Red iPhone 13");

        System.out.println("\n--- Searching for 'red' ---");
        system.searchItem("red");

        System.out.println("\n--- Displaying All Items ---");
        system.displayAllItems();
    }
}
