public class Main {
    static int myMethod(int x){return x;}
    static int myMethod(int x, int y){return x + y;}
    public static void main(String[] args) {
//----------🌍(Method Overloading)🌍--------------------------
        // function -> Method -> function same name -> Different functionality based on the inputs
        int result1 = myMethod(10);
        int result2 = myMethod(10,5);
        System.out.println(result2);
    }
}