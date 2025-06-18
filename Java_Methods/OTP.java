import java.util.HashSet;
import java.util.Scanner;
public class OTP {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; 
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        if (areUnique(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }

        sc.close();
    }
}