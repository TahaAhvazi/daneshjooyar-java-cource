import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter fileWriteerObj = new FileWriter("test.txt");
            fileWriteerObj.write("Hello world we are learning java programming language from daneshjooyar website");
            fileWriteerObj.close();
            System.out.println("Successfully wrote to the " + fileWriteerObj );
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
