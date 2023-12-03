//------💡Solving problems-HangMan💡------------------
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Let's create an object from the classes we have imported.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Let's crete a list of words that user want to guess
        String[] selectedWords = {"Java", "programing", "computer", "developer", "learning"};
        // Select a random word from the array list
        String selectedWord = selectedWords[random.nextInt(selectedWords.length)];
        // Let's initialize variables
        char[] guessedLetter = new char[selectedWord.length()];
        for (int i = 0; i < guessedLetter.length; i++) {
            guessedLetter[i] = '-';
        }
        // Limit the user guess
        int attempts = 0;
        int maxAttempts = 12;

        // Let's create the menu for the app:
        System.out.println("🔥WELCOME TO HANGMMAN🔥");
        System.out.println("Try to guess the word by suggesting letters✌️");
        // Main game loop
        while (true) {
            // Display current state of the word and prompt for letter
            System.out.println("Current word: " + new String(guessedLetter));
            System.out.println("Enter a letter: 🙌");
            char guessedLetter1 = scanner.next().charAt(0);
            attempts++;
            // check if the guessed letter is in the word
            boolean letterGuessCorrectly = false;
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guessedLetter1) {
                    guessedLetter[i] = guessedLetter1;
                    letterGuessCorrectly = true;
                }
                // Display the feedback on the guessed letters
                if (letterGuessCorrectly){
                    System.out.println("Good Guess");
                }else {
                    System.out.println("Incorrect guess");
                }
                // Check if  the user reaches the limit
                if (attempts >= maxAttempts){
                    System.out.println("Sorry you have reached you maximum attempts");
                    break;
                }
                //Check if the word is completely guessed
                if (new String(guessedLetter).equals(selectedWord)) {
                    System.out.println("Congratulation🎊 You guessed the word right");
                    System.out.println("Total Attempts: " + attempts);
                    break;
                }
            }
            System.out.println();
        }
    }
}




