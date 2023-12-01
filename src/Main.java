//------------💪 Java HashSets 💪-----------------------
import java.util.HashMap;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "Test");
        myHashMap.put(2, "Test2");
        myHashMap.put(3, "Test3");
        myHashMap.put(4, "Test4");
        myHashMap.put(5, "Test");
        System.out.println(myHashMap);
        // Let's create a HashSet ...
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Test");
        myHashSet.add("Test2");
        myHashSet.add("Test3");
        myHashSet.add("Test4");
        myHashSet.add("Test");
        System.out.println(myHashSet);
        for (String i : myHashSet){
            System.out.println(i);
        }
        myHashSet.clear();
        System.out.println(myHashSet);

    }
}




