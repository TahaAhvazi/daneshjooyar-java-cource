//---------------💪Java Polymorphism💪-----------------------
public class Main {
    public static void main(String[] args){
        //Inheritance -> subClass & superClass
        // subClass use superClass -> Method1 - > Print Hello
        // Polymorphism method1 -> Print bye | Print Hello | Print your name
        Animal myAnimal = new Animal();
        Animal myChicken = new Chicken();
        Animal myDog = new Dog();
        Animal myElephant = new Elephant();

        myAnimal.callAnimal();
        myChicken.callAnimal();
        myDog.callAnimal();
        myElephant.callAnimal();
    }
}



