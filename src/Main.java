//------------💪 Java ArrayList - part3  💪-----------------------
// Built-in  package - > Java - > Collections
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myShuffledNumbers = new ArrayList<Integer>();
        myShuffledNumbers.add(33);
        myShuffledNumbers.add(100);
        myShuffledNumbers.add(20);
        myShuffledNumbers.add(99);
        myShuffledNumbers.add(5);
        System.out.println("Unsorted array is: "+myShuffledNumbers);
        Collections.sort(myShuffledNumbers);
        System.out.println("Sorted array is: " + myShuffledNumbers );
    }
}




