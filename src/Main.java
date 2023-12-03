//------💡Problem Solving - Rock paper Scissor💡------------------

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Let's create a function to determine who is the winner
    private static void determineWinner(String userMove, String computerMove) {
        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!!!🙌");
        } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
                userMove.equals("paper") && computerMove.equals("rock") ||
                userMove.equals("scissors") && computerMove.equals("paper")
        ) {
            System.out.println("Congratulations🎊You win!");
        }else {
            System.out.println("Sorry🛑 you lost the game🛑");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Create a menu for our application
        System.out.println("Welcome to the Rock paper Scissor game 🎊🔥");
        System.out.println("Enter your move (Rock, Paper, Scissor)");
        //Let's receive the user input from the terminal
        String userMove = scanner.nextLine().toLowerCase();
        // validate user input
        if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissor")) {
            System.out.println("🛑Invalid Move🛑");
            scanner.close();
            return;
        }
        // Generate a random move for our computer
        String[] validMoves = {"rock", "paper", "scissor"};
        String computerMove = validMoves[random.nextInt(validMoves.length)];
        System.out.println("Computer move is: " + computerMove);
        // Determine the winner
        determineWinner(userMove, computerMove);
        // Prevent from memory leak
        scanner.close();
    }
}