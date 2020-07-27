package CycleClass;

import java.util.Date;

public class Movemoment {
    public void move1(Cycle c){
        Date date=new Date();
        c.ride(date);

    }

    public static void main(String[] args) {
        Movemoment m=new Movemoment();
        Cycle cycle=new Cycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Unicycle unicycle=new Unicycle();
        m.move1(cycle);
        m.move1(bicycle);
        m.move1(unicycle);
        m.move1(tricycle);

    }
}
