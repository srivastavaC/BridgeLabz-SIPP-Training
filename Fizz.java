import java.util.Scanner;
public class Fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        
        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        
        String[] results = new String[num];

        
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        
        for (int i = 0; i < num; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
    }
}
