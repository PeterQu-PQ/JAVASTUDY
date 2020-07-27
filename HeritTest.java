public class HeritTest extends Father {
    public HeritTest(){
        super("孩子");
        System.out.println("孩子类创建");
    }

    public static void main(String[] args) {
        GrandF g=new GrandF();
        Father f=new Father();
        HeritTest h=new HeritTest();

    }
}
class GrandF{
    public GrandF(){
        System.out.println("爷爷类创建");
    }
    public GrandF(String s){
        System.out.println(s+"创建的爷爷类");

    }

}
class Father extends GrandF{
    public Father(){
        System.out.println("父类创建");
    }
    public Father(String s){
        super(s);
        System.out.println(s+"创建的父类");
    }
}
