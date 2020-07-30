package zhujie;

public class PasswordUtil {
    @zhujieTest(id=80,description = "hello")
    public  boolean fun1(String password){
        return password.matches("\\w\\d\\w");
    }
    @zhujieTest(id=80)
    public  boolean fun2(String password){
        return password.matches("\\w\\d\\w");
    }
    @zhujieTest(id=80,description = "world")
    public  boolean fun3(String password){
        return password.matches("\\w\\d\\w");
    }
}
