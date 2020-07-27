package CycleClass;

import java.util.Date;

public class Bicycle extends Cycle{
    @Override
    public void ride(Date date) {
        System.out.println(date.toString()+"Bicycle");
    }
}
