package MeiJv;


public class UseEnum {
    public static void main(String[] args) {
        MyEnum e= MyEnum.GOAWAY;
        System.out.println(e);
        switch (e){
            case ATHOME:
                System.out.println("AtHome");
                break;
            case GOAWAY:
                System.out.println("GoAway");
                break;
            case WALKFAR:
                System.out.println("WalkFar");
                break;
            case MINGTIAN:
        }

    }
}
