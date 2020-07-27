package Pattern.Singleton;

public class ClassRoom {
    public static void main(String[] args) {
        Teacher teacher=Teacher.getTeacher();
        teacher.sendMessage();
        System.out.println(teacher);
        teacher=Teacher.getTeacher();
        teacher.sendMessage();
        System.out.println(teacher);
    }
}
