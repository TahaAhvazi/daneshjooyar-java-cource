import java.util.Scanner;

//------------💪Java User Input (Scanner)💪-----------------------
public class Main {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = scannerObject.nextLine();
        System.out.println("Enter your age:");
        int userAge = scannerObject.nextInt();
        System.out.println("Enter your height:");
        double userHeight = scannerObject.nextDouble();
        System.out.println("Enter your height:");
        double userHeight1 = scannerObject.nextByte();
        System.out.println(username);
        System.out.println(userAge);
    }
}




