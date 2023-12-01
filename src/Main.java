//-------------💡 Solving problems - part3 💡 -----------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScannerObject = new Scanner(System.in);
        // Ask the user for number of  elements
        System.out.println("Enter the number of elements:");
        int ArrayLength = myScannerObject.nextInt();
        // Let's create our array ...
        int[] myArray = new int[ArrayLength];
        // Receive the numbers from the user
        System.out.println("-----Enter the numbers-----");
        for (int i = 0; i<ArrayLength; i++){
            System.out.println("Element no " + (i+1) + ": ");
            myArray[i] = myScannerObject.nextInt();
        }
        // Let's calculate the sum of elements from user
        int sum = 0;
        for (int i = 0; i<myArray.length; i++){
            sum = sum + myArray[i];
        }
        //Print the result of sum
        System.out.println(sum);
        // Close the scanner to prevent resources leak
        myScannerObject.close();
    }
}




