//-----------💪(Java Class Methods)💪-----------------
 public class Main {
    // This is a static method
    static void myStaticFunction(){
        System.out.println("This is Static one");
    }
    // This is a public Method!
    public void myPublicFunction(){
        System.out.println("This is a public one");
    }
    public static void main(String[] args){
        // Let's create the Object from the class
        Main myObj = new Main();
        myStaticFunction();
        myObj.myPublicFunction();
    }
}