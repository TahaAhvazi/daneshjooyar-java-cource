//-----------💪(Java Constructors - Part2 )💪-----------------
public class Main {
    // Constructor -> Special Method
    // Whenever we create an Object
    int x;

    // Default Constructor
    public Main() {
        x = 12;
    }

    public Main(int y) {
        x = y;
    }

    public Main(int y, int u) {
        x = y * u;
    }

    public static void main(String[] args) {
        Main myObject = new Main(45);
        Main secoundObject = new Main(10,5);
        System.out.println(myObject.x);
        System.out.println(secoundObject.x);
    }
}
