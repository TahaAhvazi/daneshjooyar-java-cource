import java.util.Scanner;
public class factorialCalculator {
    // Function to calculate the factorial on a non-negative number
    private static long calculateFactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        long result = 1;
        for (int i = 2; i<=n; i++){
            result *= i;
            // result = result * i
        }
        return result;
    }
    public static void main(String[] args){
        // Input from the user
        Scanner myScannerObject = new Scanner(System.in);
        System.out.println("Enter non-Negative number please:");
        int number = myScannerObject.nextInt();
        // Check if the input is non-negative
        if (number < 0){
            System.out.println("The number should be non-Negative🛑");

        }else {
            //Calculate the factorial and print it
            long factorialResult = calculateFactorial(number);
            System.out.println("Factorial of number " + number + "is : " + factorialResult);
        }

    }
}
