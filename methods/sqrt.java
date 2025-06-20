import java.util.Scanner;
public class sqrt {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point (x1 y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        System.out.println("Enter the coordinates of the second point (x2 y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        
        sc.close();
    }
}