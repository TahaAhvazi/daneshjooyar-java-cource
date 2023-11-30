//------------💪 Java LinkedList 💪-----------------------
 //   [10 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17]
// LinkedList -> package java -> java.util
// ArrayList vs LinkedList ???
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addFirst("Toyota");
        cars.addLast("Saipa");
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getLast());
        System.out.println(cars);
    }
}




