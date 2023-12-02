//-----------💡Solving problems - Number Guess 💡------------------
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // define our range
        int lowerBound = 1;
        int upperBound = 100;
        // Let's select number in range 0 to 100 randomly
        int secreteNumber = random.nextInt(upperBound - lowerBound);
        // define a variable of number of attempts
        int attempts = 0;
        // define a bool for check if the user guess the number right or not!
        boolean hasGuessedCorrectly = false;
        // Let's create our menu for this application:
        System.out.println("-------------------------");
        System.out.println("🌍WELCOME TO THE GAME🌍");
        System.out.println("I have selected a number in range\n " + lowerBound + " and " + upperBound + " \nTry to guess this number and then you will win 🙌🎊");
        System.out.println("-------------------------");

        // Check if the user guess the secret number right or not!
        while (attempts < 11){
            System.out.println("Enter your guess🔥:" + "(" + "Chances: " + attempts + "/10" + ")" );
            int userGuess = scanner.nextInt();
            attempts++;
            // Validate if the number is right , Greater or lower
            if (userGuess < secreteNumber){
                System.out.println("Too low🛑, !Try Again!");
            } else if (userGuess > secreteNumber) {
                System.out.println("Too high🟢, !Try Again!");
            }else if (userGuess == secreteNumber){
                System.out.println("🎊Congratulations🎊 You guessed the number!!!");
                hasGuessedCorrectly = true;
            }else {
                System.out.println("🐉GAME OVER🐉");
            }
        }
        // Prevent from memory leak
        scanner.close();
    }
}




