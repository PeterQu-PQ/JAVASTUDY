package CycleClass;

import java.util.Date;

public class Tricycle extends Cycle {
    @Override
    public void ride(Date date) {
        System.out.println(date.toString()+"Tricycle");
    }
}
