package anonymsThread;

import anonymsThread.myThread;

public class test{
    public static void main(String[] args) {
        myThread t = new myThread();

        Thread th = new Thread(t);
        th.start();

//        Anonymous class
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Thread " +
                        Thread.currentThread().getName());

            }
        };
        Thread th2 = new Thread(t2);
        th2.start();

//        lambda
        Runnable t3=()->{
            System.out.println("This is Thread " +
                    Thread.currentThread().getName());
        };
        Thread th3 = new Thread(t3);
        th3.start();

    }
}
