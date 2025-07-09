class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalSurplus = 0;
        int currSurplus = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {
            int gain = pumps[i].petrol - pumps[i].distance;
            totalSurplus += gain;
            currSurplus += gain;

            if (currSurplus < 0) {
              
                start = i + 1;
                currSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int result = findStartingPoint(pumps);
        System.out.println("Start at pump index: " + result); 
    }
}
