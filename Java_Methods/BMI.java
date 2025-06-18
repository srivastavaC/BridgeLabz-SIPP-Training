import java.util.Scanner;
public class BMI {
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
        return data;
    }

    public static String[] determineStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            data[i][1] = sc.nextDouble();
        }

        data = calculateBMI(data);
        String[] statuses = determineStatus(data);

        System.out.println("\nBMI Results:");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Person %d: Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                    (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        sc.close();
    }
}