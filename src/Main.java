//-------------💪Java Regular Expressions -----------------------
// Pattern
// Matcher
// PatternSyntaxException
// Java package -> java.util.regex
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        Pattern patternObject = Pattern.compile("daneshjooyar", Pattern.CASE_INSENSITIVE);
        Matcher matcherObject = patternObject.matcher("learn with daneshjoOyar");
        boolean matchFound = matcherObject.find();
        if (matchFound){
            System.out.println("Daneshjooyar is exsists- found");
        }else {
            System.out.println("Daneshjooyar is not exsist - not found");
        }
    }
}




