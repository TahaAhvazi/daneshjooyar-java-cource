//-----------💡Solving problems -LeapYearChecker💡------------------
import java.util.Scanner;
public class Main {
    // This function check if the year that user entered is a Leap year or not
    private static boolean isLeapYear(int year){
        // Leap year condition
        // 1. If the year is evenly divisible by 4
        // 2. If the year is not divisible by 100, Except when it is divisible by 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args){
        // Create an Object from the Scanner class
        Scanner myScannerObject = new Scanner(System.in);
        // Receive the year from the user
        System.out.println("Enter the Year please: ");
        int Year = myScannerObject.nextInt();
        // Check if the year is  a leap year using the isLeapYear function
        if (isLeapYear(Year)){
            System.out.println("✅ The Year: " + Year + " is a Leap year  ✅");
        }else {
            System.out.println("🛑 The year: " + Year + " is not a leap year 🛑");
        }
        // Preventing memory leak by closing the Input stream from the scanner
        myScannerObject.close();
    }
}




