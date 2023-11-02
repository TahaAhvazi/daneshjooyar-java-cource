public class Main {
    public static void main(String[] args) {
//----------🌍(Parameters and Arguments)🌍--------------------------
        int resultInMain = myMultiplicationMethod(10,3);
        System.out.println(resultInMain);
    }
    // I want to create a function to say hello to my users
    static void sayHello(String userName){
        System.out.println("Hello " + userName);
    }
    // This function is going to show user information
    static void showUserInformation(String userName,int age, int weight){
        System.out.println("User name is " + userName + " and user age is " + age + " and user weight is " + weight);
    }
    // This function is going to calculate the multiplication of to decimal numbers
    static int myMultiplicationMethod(int a , int b){
        int result = a * b;
        return result;
    }
}