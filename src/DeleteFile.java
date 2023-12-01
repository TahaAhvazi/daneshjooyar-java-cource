import java.io.File;
public class DeleteFile {
    public static void main(String[] args){
        File myFileObject = new File("test1.txt");
        if (myFileObject.delete()){
            System.out.println("Deleted the file: " + myFileObject.getName());
        }else {
            System.out.println("Failed to delete the file");
        }
    }
}
