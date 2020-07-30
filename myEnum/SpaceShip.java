package myEnum;
import static myutils.Print.*;
public enum SpaceShip {
    CAR,Ship,Transport,Bicycle,Plane;
    public String toString(){
        String id=name();
        String lower=id.substring(1).toLowerCase();
        return id.charAt(0)+lower;

    }

    public static void main(String[] args) {
        for (SpaceShip s:values()){
            println(s);
        }
    }
}
