import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second number :");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        double result = 0;
        switch(operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter one of +, -, *, /.");
                return; 
        }
    }
    
}
