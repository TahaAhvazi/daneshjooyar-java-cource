import java.util.Scanner;
public class PrimeNumberGenerator {
    //Let's create a function to generate a prime numbers and ten print them
    private static void generateAndPrintPrimesNumber(int limit){
        boolean[] isPrime = new boolean[limit+1];
        //Assume all numbers are prime initially
        for (int i = 2; i<= limit; i++){
            isPrime[i] = true;
        }
        // Mark multiples as non-prime
        for (int i = 2; i*i <= limit; i++){
            if (isPrime[i]){
                for (int j = i*i; j<= limit; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        // now we print all the prime numbers till the limit
        for (int i = 2; i<= limit; i++){
            if (isPrime[i]){
                System.out.println(i+ "is prime✅\n");
            }
        }
    }
    public static void main(String[] args){
        Scanner myScannerObject = new Scanner(System.in);
        //Let's receive the limit from the user as Input
        System.out.println("Enter the length of prime numbers: ");
        int limit = myScannerObject.nextInt();
        //Let's use our previous function and print prime values
        generateAndPrintPrimesNumber(limit);
        // closing the stream of inputs to prevent the memory leak
        myScannerObject.close();
    }
}
