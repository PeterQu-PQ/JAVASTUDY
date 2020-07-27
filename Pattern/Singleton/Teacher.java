package Pattern.Singleton;

public class Teacher {
    private static Teacher teacher=new Teacher();
    public static Teacher getTeacher(){
        return teacher;
    }
    private Teacher(){ }
    public void sendMessage(){
        System.out.println("这是一个单例模式");
    }
}
