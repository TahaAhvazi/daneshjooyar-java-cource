//------------💪 Java Iterator 💪-----------------------
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(12);
        myArrayList.add(3);
        myArrayList.add(56);
        myArrayList.add(12);
        myArrayList.add(566);

        Iterator<Integer> myIterator = myArrayList.iterator();
        while (myIterator.hasNext()){
            Integer i = myIterator.next();
            if (i<=12){
                myIterator.remove();
            }
        }
        System.out.println(myArrayList);
    }
}




