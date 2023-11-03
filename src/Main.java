public class Main {
    public static void main(String[] args) {
//----------🌍(Java Scope)🌍--------------------------
       // We can not use myNumber here
        int myNumber = 20;
        // We can use myNumber here
        System.out.println(myNumber);
        {
            int yourNumber = 30;
            System.out.println(yourNumber);
        }
//       System.out.println(yourNumber);
    }
}