//-----------💪(Java Class Attributes)💪-----------------
 public class Main {
    int x = 150;
    int y = 200;
    String myName = "Taha";
    String myCity = "Ahvaz";
    public static void main(String[] args){
        Main myFirstObject =  new Main();
        Main mySecoundObject = new Main();

        myFirstObject.x = 205;
        myFirstObject.y = 100;

        mySecoundObject.x  = 1;
        mySecoundObject.y = 2;

        System.out.println(myFirstObject.x + myFirstObject.y);
        System.out.println(mySecoundObject.y + mySecoundObject.x);
    }
}