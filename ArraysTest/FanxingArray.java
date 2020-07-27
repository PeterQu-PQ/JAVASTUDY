package ArraysTest;

import java.util.ArrayList;
import java.util.List;

public class FanxingArray {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> [] a;
        List[] b=new List[20];
        a=(List<String> [])b;
        a[0]=new ArrayList<String>();

    }

}
