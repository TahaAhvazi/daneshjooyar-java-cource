//-------------💡 Solving problems - part4 💡 -----------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Let's create our scanner object
        Scanner scannerObj = new Scanner(System.in);
        // Let's create a setup for ourselves
        System.out.println("-----------------");
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("-----------------");
        // Get the user Input for shape detection
        System.out.println("Enter the shape number: ");
        int shapeChoice = scannerObj.nextInt();
        //Create our switch to define the logic base on the user selection
        switch (shapeChoice) {
            case 1 -> {
                //Rectangle
                System.out.println("Enter the length of Rectangle: ");
                int length = scannerObj.nextInt();
                System.out.println("Enter the width of Rectangle: ");
                int width = scannerObj.nextInt();
                int areaRectangle = length * width;
                System.out.println("Area of the Rectangle is: " + areaRectangle);
            }
            case 2 -> {
                //Square
                System.out.println("Enter the side Length of the square: ");
                int sideLength = scannerObj.nextInt();
                int areaSquare = sideLength * sideLength;
                System.out.println("The Area of the Square is: " + areaSquare);
            }
            case 3 -> {
                // Circle
                System.out.println("Enter the radius of the circle: ");
                double radius = scannerObj.nextDouble();
                double areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("The area of the circle is: " + areaCircle);
            }
            default -> System.out.println("Invalid choice - Please double check the menu");
        }
    }
}




