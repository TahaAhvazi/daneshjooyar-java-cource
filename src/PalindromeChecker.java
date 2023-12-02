import java.util.Scanner;
public class PalindromeChecker {
    // Let's create a boolean function ti check if the word is palindrome
    private static boolean isPalindrome(String str){
        // L  evE l -> remove the white spaces and make the word lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        // check if the user input is palindrome or not!
        int i = 0, j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner myScannerObject = new Scanner(System.in);
        // receive the word from the user
        System.out.println("Please enter the word: ");
        String userInput = myScannerObject.nextLine();
        // use the isPalindrome function
        if (isPalindrome(userInput)){
            System.out.println("'" + userInput + "'" + "is Palindrome ✅");
        }else {
            System.out.println("'" + userInput + "'" + "is not Palindrome 🛑");
        }
    }
}
