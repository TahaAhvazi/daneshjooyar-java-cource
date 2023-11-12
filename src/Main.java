//---------💪(JAVA Built-in Packages)💪---------------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner myScannerObject = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Enter your name: ");
        System.out.println("------------------");
        String userName = myScannerObject.nextLine();
        System.out.println("User name is: " + userName);
    }

}



