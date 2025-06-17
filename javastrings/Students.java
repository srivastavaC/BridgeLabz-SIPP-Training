package javastrings;

public class Students {
    public static void main(String[] args) {
        int[] ages = getStudentAges(10);
        String[][] votingEligibility = checkVotingEligibility(ages);
        displayVotingEligibility(votingEligibility);
    }

    public static int[] getStudentAges(int n) {
        int[] ages = new int[n];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                eligibility[i][0] = "Invalid age";
                eligibility[i][1] = "Cannot vote";
            } else if (ages[i] >= 18) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Can vote";
            } else {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Cannot vote";
            }
        }
        
        return eligibility;
    }

    public static void displayVotingEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("-----------------------------");
        
        for (String[] entry : eligibility) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }
    
}
