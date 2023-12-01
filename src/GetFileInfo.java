import java.io.File;
 class GetFileInfo {
   public static void main(String[] args){
       File myObj = new File("test.txt");
       if (myObj.exists()){
           System.out.println("The file name is: " + myObj.getName() );
           System.out.println("The file path is: " +  myObj.getAbsolutePath());
           System.out.println("The file is writeable: " + myObj.canWrite());
           System.out.println("The file is Readable: " + myObj.canRead());
           System.out.println("The file size in byte is: " + myObj.length() + "b");
       }else {
           System.out.println("The file is not exist");
       }
   }
}
