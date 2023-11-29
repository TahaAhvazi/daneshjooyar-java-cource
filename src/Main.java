//---------------💪Java Abstraction💪-----------------------
// This is a super-class include all animals
abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println(
                "Zzz"
        );
    }
}
class Pig extends Animal {
    @Override
    public void animalSound(){
        System.out.println("wee wee");
    }
}
public class Main {
    public static void main(String[] args){
        Pig myPigObject = new Pig();
        myPigObject.animalSound();
    }
}



