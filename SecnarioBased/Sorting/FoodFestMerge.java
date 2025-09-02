import java.util.*;

class Stall {
    String name;
    int footfall;

    Stall(String name, int footfall) {
        this.name = name;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return name + ": " + footfall + " visitors";
    }
}

public class FoodFestMerge {

    
    public static List<Stall> mergeSortedLists(List<Stall> list1, List<Stall> list2) {
        List<Stall> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).footfall < list2.get(j).footfall) {
                merged.add(list1.get(i++));
            } else if (list1.get(i).footfall > list2.get(j).footfall) {
                merged.add(list2.get(j++));
            } else {
                
                merged.add(list1.get(i++));
            }
        }

       
        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));

        return merged;
    }

    public static void main(String[] args) {
       
        List<Stall> zone1 = Arrays.asList(
            new Stall("StallA", 100),
            new Stall("StallB", 200),
            new Stall("StallC", 300)
        );

        
        List<Stall> zone2 = Arrays.asList(
            new Stall("StallD", 150),
            new Stall("StallE", 200),
            new Stall("StallF", 400)
        );

       
        List<Stall> masterList = mergeSortedLists(zone1, zone2);

       
        System.out.println("Merged Master List by Footfall:");
        for (Stall s : masterList) {
            System.out.println(s);
        }
    }
}
