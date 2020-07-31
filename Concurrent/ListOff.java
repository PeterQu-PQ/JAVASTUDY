package Concurrent;

public class ListOff {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            private int second=0;
            private int minute=0;
            private int hour=0;
            public void run() {

                try {
                    while (second<60){
                        System.out.format("%2d:%2d:%2d\n",hour,minute,second);
                        second++;
                        if (second==60){
                            minute++;
                            if (minute==60){
                                hour++;
                                if (hour==24){
                                    hour=0;
                                }
                                minute=0;
                            }
                            second=0;
                        }

                        Thread.sleep(100l);

                    }
                }catch (InterruptedException r){
                    System.err.println("Interrupted");
                }

            }
        });
        t.start();

    }

}
