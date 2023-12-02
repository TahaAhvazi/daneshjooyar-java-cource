//-------------💡Solving problems - Text reversal💡-----------------------
import java.util.Scanner;
public class Main {
    private static String reverseString(String str){
        // word -> w, o , r ,d
        // drow <- d, r , o ,w
        char[] charArray = str.toCharArray();
        // Let's reverse the string we receive from the user
        int start = 0;
        int end =  str.length() - 1;
        while (start < end){
            char temp = charArray[start]; // w - o
            charArray[start] = charArray[end]; // d r  o  w
            charArray[end] = temp; //
            start ++; // 1 // 2
            end --; // 2 // 1
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Let's receive the user input (Word)
        System.out.println("Enter the word or sentence to reverse: ");
        String input = scanner.nextLine();
        String reversedText = reverseString(input);
        System.out.println("The reversed String of " + input + " is " + reversedText );
    }
}




