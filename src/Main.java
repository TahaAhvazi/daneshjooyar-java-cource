//-------------💪Java File Handling 💪 -----------------------
// File -> class -> Java package : io
// createNewFile() -> Create file using java
import java.io.IOException;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        try {
            File fileObj = new File("test.txt");
            if (fileObj.createNewFile()){
                System.out.println("File is created: " + fileObj.getName());
            }else {
                System.out.println("File is already exist");
            }
        }catch (IOException ioException){
            System.out.println("An error occurred");
            ioException.printStackTrace();
        }
    }
}




