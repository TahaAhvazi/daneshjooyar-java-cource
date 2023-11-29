//---------------💪Java Interface💪-----------------------
// abstraction -> interface
// Let's create our interface
interface Thing {
    public void callMe();
}
interface Animal {
    public void animalSound();
    public void run();
}
// Let's use the animal interface for our Pig class
class Pig implements Thing , Animal {
    @Override
    public void callMe() {
        System.out.println("Called");
    }
    @Override
    public void animalSound(){
        System.out.println("wee wee");
    }
    @Override
    public void run(){
        System.out.println("the animal is running");
    }
}
public class Main {
    public static void main(String[] args){
        Pig pigObject = new Pig();
        pigObject.animalSound();
        pigObject.run();
        pigObject.callMe();
    }
}



