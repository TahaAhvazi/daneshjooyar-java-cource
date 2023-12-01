//-------------💡Java Lambda Expressions💡 -----------------------
// Java version 8
// Lambda -> short of a code block - > parameters -> return value
// parameters -> expression
// (parameter1 , parameter2) -> expression
// (parameter1 , parameter2) -> {code bloc}
import java.util.ArrayList;
import java.util.function.Consumer;
interface StringFunction {
    String run(String str);
}
public class Main {
    public static void printFormatted(String str, StringFunction format){
        String result  = format.run(str);
        System.out.println(result);
    }
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Your shirt is blue", exclaim);
        printFormatted("Your shirt is red", ask);
    }
}




