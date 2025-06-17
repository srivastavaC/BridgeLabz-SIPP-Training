
package javastrings;
import java.util.Random;    
import java.util.Scanner;
public class Rock_Paper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playerWins = 0;
        int computerWins = 0;
        int totalGames = 0;

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter the number of games you want to play (or type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int gamesToPlay = Integer.parseInt(input);
                for (int i = 0; i < gamesToPlay; i++) {
                    System.out.print("Enter your choice (rock, paper, scissors): ");
                    String playerChoice = scanner.nextLine().toLowerCase();

                    String[] choices = {"rock", "paper", "scissors"};
                    String computerChoice = choices[random.nextInt(choices.length)];

                    System.out.println("Computer chose: " + computerChoice);

                    if (playerChoice.equals(computerChoice)) {
                        System.out.println("It's a tie!");
                    } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                               (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                               (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                        System.out.println("You win!");
                        playerWins++;
                    } else {
                        System.out.println("Computer wins!");
                        computerWins++;
                    }
                    totalGames++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or type 'exit' to quit.");
            }
        }

        // Display results
        System.out.println("\nGame Statistics:");
        System.out.printf("%-15s %-15s %-15s\n", "Player Wins", "Computer Wins", "Total Games");
        System.out.printf("%-15d %-15d %-15d\n", playerWins, computerWins, totalGames);

        double playerWinPercentage = (double) playerWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

                System.out.printf("\nWinning Percentage:\n");
            }
        }