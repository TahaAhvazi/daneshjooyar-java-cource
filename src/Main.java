//------💪Java Exceptions {Try🟢Catch🟢Finally}💪-----------------------
// try {
//      // mmy code
        // my code
// }catch(Exception e){
//      Show a  custom error -> e
// }finally{
//      // do whatever you wanna do ->(Optional)
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try{
//            int[] myNumber = {0,1,2,3,4,5,6,7,8,9};
//            System.out.println(myNumber[7]);
//        }catch (Exception e){
//            System.out.println("\uD83D\uDFE2 Error out of range \uD83D\uDFE2");
//        }finally {
//            System.out.println("The application job is done!");
//        }
        while (true){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter your age: \n");
            int userAge = myScanner.nextInt();
            CheckAge myObject = new CheckAge();
            myObject.checkAge(userAge);
        }
    }
}




