
public class IceCreamRush {
    public static void main(String[] args) {
        String[] flavors = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Mango", "Butterscotch", "Blueberry", "Pistachio"};
        int[] sales = {120, 200, 150, 90, 180, 110, 95, 130};

        int n = sales.length;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] < sales[j + 1]) {
                 
                    int tempSale = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSale;

                   
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }

        System.out.println("Flavors sorted by popularity (most to least sold):");
        for (int i = 0; i < n; i++) {
            System.out.println(flavors[i] + ": " + sales[i] + " sales");
        }
    }
}
