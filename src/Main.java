//-----------💡Solving problems -CalculatorApp 💡------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create an object from our scanner class
        Scanner myScannerObject = new Scanner(System.in);
        // let's start receive the user input
        System.out.println("Enter the first number: ");
        int fNumber = myScannerObject.nextInt();
        System.out.println("Enter the secound number: ");
        int sNumber = myScannerObject.nextInt();
        // Let's create a Menu for our calculator
        System.out.println("Select the operation: ");
        System.out.println("---------------------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3.Multiplication (×)");
        System.out.println("4. Division (÷)");
        System.out.println("---------------------");
        System.out.println("Enter the choice (1-4) 👋");
        int choice = myScannerObject.nextInt();

        double result = 0;
        switch (choice) {
            case 1 -> {
                result = fNumber + sNumber;
            }
            case 2 -> {
                result = fNumber - sNumber;
            }
            case 3 -> {
                result = fNumber * sNumber;
            }
            case 4 -> {
                // Check if the secound number is not zero (to avoid errors)
                if (sNumber != 0) {
                    result = (double) fNumber / sNumber;
                }else {
                    System.out.println("You can not divide numbers by 0 🛑");
                    return; //Break -> Exit from application
                }
            }
            default -> {
                System.out.println("Invalid choice please enter a number between 1 and 4.💡");
            }
        }
        // Print the result of calculation:
        System.out.println("Result: " + result);
        // prevent the memory leak;
        myScannerObject.close();
    }
}




