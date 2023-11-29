import java.util.Scanner;

//---------------💪Java Enums💪-----------------------
// Enums are some special classes -> Final
// How to create an Enum ? -> enum
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main {
    public static void main(String[] args) {
//        Level myValue = Level.LOW;
//        System.out.println(myValue);

        while (true) {
            System.out.println("-----------");
            System.out.println("Enter your level:");
            System.out.print("-----------\n");
            Scanner myScanner = new Scanner(System.in);
            Level value = Level.HIGH;
            String userInput = myScanner.nextLine();

            if (userInput.equals("low") || userInput.equals("Low")) {
                value = Level.LOW;
            } else if (userInput.equals("medium") || userInput.equals("Medium")) {
                value = Level.MEDIUM;
            } else if(userInput.equals("high") || userInput.equals("High")){
               value = Level.HIGH;
            } else if (userInput.equals("exsit") || userInput.equals("Exsit")) {
                break;
            }else {
                break;
            }
            switch (value) {
                case LOW:
                    System.out.println("Low level");
                    break;
                case MEDIUM:
                    System.out.println("Medium level");
                    break;
                case HIGH:
                    System.out.println("High level");
                    break;
            }
        }
    }
}



