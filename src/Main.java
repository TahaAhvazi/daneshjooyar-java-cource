//------------💪 Java ArrayList - part2 💪-----------------------
// Java Built-in -> Array -> Fixed size
// Java package -> Array List -> Resizeable array -> Java package
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(23); //0
        cars.add(110); //1
        cars.add(56); //2
        cars.add(76); // 3
        cars.set(2,44);  //2
        cars.add(89); // 4
        cars.remove(4);
        //cars.clear();
//        System.out.println(cars.size());
        System.out.println(cars);
//        for (int i = 0; i< cars.size(); i++){
//            System.out.println(cars.get(i));
//        }
        for (int i : cars){
            System.out.println(i);
        }
    }
}




