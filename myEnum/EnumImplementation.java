package myEnum;
import interfaces.Generator;

import java.util.Random;

import static myutils.Print.*;

enum CartoonCharacter implements Generator<CartoonCharacter>{
    SSADSADS,SADASDASDII,OOJJD,RHFFJF;
    private Random random=new Random(47);
    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        print(rg.next()+".");
    }

    public static void main(String[] args) {
        CartoonCharacter cc=CartoonCharacter.OOJJD;
        for (int i=0;i<10;i++)
            printNext(cc);
    }
}
