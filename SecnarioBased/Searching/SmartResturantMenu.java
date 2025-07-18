import java.util.*;

class MenuDish {
    String name;
    String type;
    List<String> tags;

    public MenuDish(String name, String type, List<String> tags) {
        this.name = name;
        this.type = type;
        this.tags = tags;
    }

    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Tags: " + tags;
    }
}

public class SmartResturantMenu {
    private ArrayList<MenuDish> menu = new ArrayList<>();
    private HashSet<String> dishNames = new HashSet<>();

    public void addDish(String name, String type, List<String> tags) {
        if (dishNames.contains(name.toLowerCase())) {
            System.out.println("Duplicate dish. Not added: " + name);
            return;
        }
        MenuDish dish = new MenuDish(name, type, tags);
        menu.add(dish);
        dishNames.add(name.toLowerCase());
        System.out.println("Dish added: " + name);
    }

    public void searchDish(String keyword) {
        boolean found = false;
        for (MenuDish dish : menu) {
            if (dish.name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(dish);
                found = true;
            } else {
                for (String tag : dish.tags) {
                    if (tag.toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println(dish);
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No dishes matched the keyword: " + keyword);
        }
    }

    public void displayAllDishes() {
        for (MenuDish dish : menu) {
            System.out.println(dish);
        }
    }

    public static void main(String[] args) {
        SmartRestaurantMenu menu = new SmartRestaurantMenu();

        menu.addDish("Paneer Tikka", "Starter", Arrays.asList("spicy", "grilled", "paneer"));
        menu.addDish("Chicken Biryani", "Main Course", Arrays.asList("rice", "spicy", "chicken"));
        menu.addDish("Mango Lassi", "Beverage", Arrays.asList("sweet", "cold", "mango"));
        menu.addDish("Paneer Tikka", "Starter", Arrays.asList("duplicate test"));

        System.out.println("\n--- Search for 'spicy' ---");
        menu.searchDish("spicy");

        System.out.println("\n--- All Menu Items ---");
        menu.displayAllDishes();
    }
}
