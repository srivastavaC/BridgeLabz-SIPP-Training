import java.util.*;
public class Multiplication {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    
}
