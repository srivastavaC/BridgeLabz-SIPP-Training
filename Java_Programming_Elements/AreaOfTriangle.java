package java_programming_elements; 
class AreaOfTriangle {
    public static void main(String[] args) {
        double base = 5.0;
        double height = 10.0;
        double area = calculateArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}