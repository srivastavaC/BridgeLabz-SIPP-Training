import java.util.Scanner;
public class ThreePoint {
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if (areCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), and C(" + x3 + ", " + y3 + ") are collinear.");
        } else {
            System.out.println("The points A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), and C(" + x3 + ", " + y3 + ") are not collinear.");
        }
        
        sc.close();
    }
}