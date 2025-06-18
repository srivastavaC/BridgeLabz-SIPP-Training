import java.util.Random;

public class Football {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
        }

        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nShortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
        System.out.println("Mean height: " + mean + " cms");
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int sum, int numberOfPlayers) {
        return (double) sum / numberOfPlayers;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}