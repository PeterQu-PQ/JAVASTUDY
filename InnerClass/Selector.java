package InnerClass;

interface Interation {
    boolean end();
    Object current();
    void next();
}
public class Selector{
    private Object[] items;
    private int next=0;
    public Selector(int size){
        items=new Object[size];

    }
    public void add(Object x){
        if(next<items.length){
            items[next++]=x;

        }
    }
    private class InnerSelector implements Interation {
        private int i = 0;

        public boolean end() {
            return (i == items.length);
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }
    public Interation interation(){
        return new InnerSelector();
    }

    public static void main(String[] args) {
        Selector selector=new Selector(10);
        for (int i=0;i<10;i++){
            selector.add(Integer.toString(i));
        }
        Interation interation=selector.interation();
        while (!interation.end()){
            System.out.print(interation.current()+" ");
            interation.next();
        }
    }

    }

