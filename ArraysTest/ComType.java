package ArraysTest;

public class ComType implements Comparable<ComType> {
    int i;
    int j;
    private static int count=1;
    public ComType(int n,int m){
        this.i=n;
        this.j=m;

    }
    public int compareTo(ComType o) {
        return 0;
    }
    public String toString(){
        String result="[i+"+i+",j="+j+"]";
        if(count++%3==0)
            result +="\n";

        return result;
    }
}
