package java_programming_elements;
import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }
    
}
