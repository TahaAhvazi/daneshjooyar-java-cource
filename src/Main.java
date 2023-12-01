//-------------💡 Solving problems 💡 -----------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1,number2,result;
        Scanner myScannerObject = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = myScannerObject.nextInt();
        System.out.println("Enter the secound number: ");
        number2 = myScannerObject.nextInt();

        result = number2 * number1;
        System.out.println("------------------");
        System.out.println("---result:" + result + "-----");
        System.out.println("------------------");
    }
}




