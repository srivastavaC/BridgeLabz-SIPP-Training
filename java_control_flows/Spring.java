package day_1;
import java.util.Scanner;

public class Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date : ");
		int day = sc.nextInt();
		System.out.println("Enter the Month : ");
		int month = sc.nextInt();
		 if (month == 3) {
	            if (day >= 20 && day <= 31) {
	                System.out.println("It's a Spring Season");
	            } else {
	                System.out.println("Not a Spring Season");
	            }
	        } else if (month == 4) {
	            if (day >= 1 && day <= 30) {
	                System.out.println("It's a Spring Season");
	            } else {
	                System.out.println("Not a Spring Season");
	            }
	        } else if (month == 5) {
	            if (day >= 1 && day <= 31) {
	                System.out.println("It's a Spring Season");
	            } else {
	                System.out.println("Not a Spring Season");
	            }
	        } else if (month == 6) {
	            if (day >= 1 && day <= 20) {
	                System.out.println("It's a Spring Season");
	            } else {
	                System.out.println("Not a Spring Season");
	            }
	        } else {
	            System.out.println("Not a Spring Season");
	        }
	    }
	}

