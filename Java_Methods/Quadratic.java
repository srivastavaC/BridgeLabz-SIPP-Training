import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots != null) {
            System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
        } else {
            System.out.println("No real roots.");
        }
        
        sc.close();
    }

    public static double[] findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return null;
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{root1, root2};
    }
    
}
