//------💡Solving problems- Coin TossGame 💡------------------
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        // Let's create our menu for the game
        System.out.println("Welcome to the Coin Tossing Game🪙!");
        System.out.println("I will toss a coin, and you have to guess!💡");
        // Toss the coin (0 -> head , 1 -> tails)
        int coinResult = random.nextInt(2);
        // Receive the user's guess
        System.out.println("Enter your guess (head/tails):🟢 ");
        String userGuess = scanner.nextLine().toLowerCase();
        // Display the result for the user:
        System.out.println("Coin Result🪙: " + (coinResult == 0 ? "Head" : "Tail"));
        //Check if the user guess is correct
        if (coinResult == 0 && userGuess.equals("heads") || (coinResult == 1 && userGuess.equals("tails"))){
            System.out.println("Congratulations🎊 Your guess is right!");
        }else {
            System.out.println("Sorry! Your guess is unfortunately wrong!");
        }
    }
}




