//---------------💪Java Inner Classes💪-----------------------
class OuterClass{
    int x = 10;
     class InnerClass{
        int y = 8;
        public int myOuterClassReturner(){
            return x;
        }
    }
}
public class Main {
    public static void main(String[] args){
//        OuterClass myOuterClass = new OuterClass();
//        OuterClass.InnerClass myInnerClass = new OuterClass.InnerClass();
//        System.out.println(myInnerClass.y + myOuterClass.x );
        OuterClass outerclass = new OuterClass();
        OuterClass.InnerClass myInnerClass = outerclass.new InnerClass();
        int result = myInnerClass.myOuterClassReturner();
        System.out.println(result);
    }
}



