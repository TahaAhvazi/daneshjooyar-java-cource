//-----------💪(Java Constructors - Part1 )💪-----------------
public class Main {
    // Constructor -> Special Method
    // Whenever we create an Object
    int x;
    public Main(){
        x = 12;
    }
    public static void main(String[] args){
        Main myObject = new Main();
        System.out.println(myObject.x);
    }
}
