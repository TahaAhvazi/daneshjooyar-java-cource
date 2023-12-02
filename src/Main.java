//----💡Solving problems - FibonacciSequenceGenerator💡------------------
import java.util.Scanner;
public class Main {
    // Let's create the function for fibonacci sequence
    private static void generateAndPrintFibonacciSequence(int numberOfTerms){
        int firstTerm = 0;
        int secoundTerm = 1;
        for (int i = 0; i< numberOfTerms; i++){
            System.out.println(firstTerm + " ");
            int nextTerm = firstTerm + secoundTerm;
            firstTerm = secoundTerm;
            secoundTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        // 1+2+3+4+5
        // 0+ 1 + 1 + 2 + 3 + 5 + 8 + 13 + ...
        // 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 +34 + 55 + 89
        // Let's receive the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms please🔥✌️:");
        int numberOfTerms =  scanner.nextInt();
        //Let's use the function to generate the fibonacci sequence
        System.out.println("Fibonacci sequence up to: " + numberOfTerms + "💡");
        generateAndPrintFibonacciSequence(numberOfTerms);
        // Prevent from  memory leak
        scanner.close();
    }
}




