import java.io.File;
import java.io.FileNotFoundException; // Error handling
import java.util.Scanner; // for scanning and reading the content of the file
public class ReadFile {
    public static void main(String[] args){
        try {
            File myFileObj = new File("test.txt");
            Scanner scannerObj =  new Scanner(myFileObj);
            while (scannerObj.hasNextLine()){
                String contentOfFile = scannerObj.nextLine();
                System.out.println(contentOfFile);
            }
            scannerObj.close();
        }catch (FileNotFoundException e){
            System.out.println("There is an error!");
            e.printStackTrace();
        }
    }
}
