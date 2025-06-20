import java.util.Scanner;
public class N_Handshake {
    public static int calculateHandshakes(int n){
        if (n < 2) {
            return 0; 
        }
        return n * (n - 1) / 2; 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("The total number of handshakes is: " + handshakes);
        sc.close();
    }
}
