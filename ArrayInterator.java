import java.util.Random;

/**
 * 
 */

class ArrayInterator {
    /**
     * 数组的初始化
     * @param a 输入的数组参数
     */
    public  void printV(int[] a){
        for(int every:a)
        System.out.println(every);

    }
    public int  isNull(int[] a){
        return a==null?0:1;

    }


    public static void main(String[] args){
        ArrayInterator Interator=new ArrayInterator();
        int[] A=null;
        Random random=new Random(47);
        A=new int[random.nextInt(10)];
        System.out.println(A.length);
        System.out.println(A.toString());
        A=new int[random.nextInt(10)];
        System.out.println(A.length);
        System.out.println(A.toString());
        A=new int[random.nextInt(10)];
        System.out.println(A.length);
        System.out.println(A.toString());
        A=new int[random.nextInt(10)];
        System.out.println(A.length);
        System.out.println(A.toString());
        A=new int[random.nextInt(10)];
        System.out.println(A.length);
        System.out.println(A.toString());
        System.out.println("此数组的当前状态"+Interator.isNull(A));


    }

}
