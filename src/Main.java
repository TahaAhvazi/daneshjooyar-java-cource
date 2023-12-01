//------------💪 Java HashMap 💪-----------------------
// Array list , Array -> index -> 2 -> 3 -> int
// Hash map -> Key/Value -> e.g. String , int
//package Java
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Iran", "Tehran");
//        capitalCities.remove("Norway");
//        capitalCities.clear();
//        System.out.println(capitalCities.size());
        System.out.println(capitalCities);
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
        System.out.println("-------------------");
        for (String i : capitalCities.values()){
            System.out.println(i);
        }
    }
}




