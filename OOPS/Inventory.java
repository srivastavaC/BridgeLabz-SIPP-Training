public class Inventory {
    int ItemCode;
    String ItemName;
    double price;
    public Inventory(int ItemCode, String ItemName, double price) {
        this.ItemCode = ItemCode;
        this.ItemName = ItemName;
        this.price = price;
    }

    public void display() {
        System.out.println("Item Code: " + ItemCode);
        System.out.println("Item Name: " + ItemName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Inventory item = new Inventory(111, "Laptop", 75000.0);
        item.display();
    }
}