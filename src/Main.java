//--------💡Solving problems - BMI Calculator 💡------------------

import java.util.Scanner;

public class Main {
    // go and create a java application to calculate bmi of the users
    // Let's create a function to calculate the BMI
    private static double calculateBMI(double height, double weight) {
        double BMI;
        BMI = weight / (height * height);
        return BMI;

    }
    //Let's create a function to detect the bmi status of users
    private static void detectStatusBMI(double bmi){
        System.out.println("BMI Category💡: ");
        if (bmi < 18.6){
            System.out.println("UnderWeight🛑🛑");
        } else if (bmi < 25) {
            System.out.println("Normal Weight🟢");
        } else if (bmi < 30) {
            System.out.println("OverWeight🛑");
        }else {
           System.out.println("Obese🛑🛑");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Receive the data as input from user
        System.out.println("Enter your weight in Kilograms🙌: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in Meters🙌: ");
        double height = scanner.nextDouble();
        // Let's calculate the BMI
        double bmi = calculateBMI(height, weight);
        // Display the result:
        System.out.println("Your bmi is🔥: " + bmi);
        detectStatusBMI(bmi);
    }
}




