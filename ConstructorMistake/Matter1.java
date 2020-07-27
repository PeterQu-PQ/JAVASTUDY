package ConstructorMistake;

public class Matter1 {
    public static void main(String[] args) {
        new Son();

    }
}
class Father{
    public void call(){
        System.out.println("Father");

    }
    Father (){
        System.out.println("subMethod excute before");
        call();
        System.out.println("subMethod excute after");
    }
}
class Son extends Father{
    @Override
    public void call() {
        System.out.println("Son");

    }
    Son(){
        System.out.println("Now Create Son");
    }
}