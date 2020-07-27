package ClassType;
interface FaceA{}
interface FaceB{

}
interface  FaceC{

}
class A{

}
class B extends A implements FaceA,FaceB,FaceC{

}
class C extends A{

}
public class TryClass {
    public static void main(String[] args) {
        TryClass a=new TryClass();

        try {
            Class c = Class.forName("ClassType.TryClass");
            System.out.println("找到");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println(c.toString());
    }
}
