package java_control_flows;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter your weight (in kilograms): ");
	        double weight = sc.nextDouble();

	        System.out.print("Enter your height (in meters): ");
	        double height = sc.nextDouble();

	       
	        double bmi = weight / (height * height);

	        
	        System.out.printf("Your BMI is: %.2f\n", bmi);

	        
	        if (bmi < 18.5) {
	            System.out.println("Category: Underweight");
	        } else if (bmi >= 18.5 && bmi < 24.9) {
	            System.out.println("Category: Normal weight");
	        } else if (bmi >= 25 && bmi < 29.9) {
	            System.out.println("Category: Overweight");
	        } else {
	            System.out.println("Category: Obese");
	        }

	}

}
