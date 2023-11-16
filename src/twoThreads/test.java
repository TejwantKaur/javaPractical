package twoThreads;

public class test {
    public static void main(String[] args) {

        myRunnableThread mr = new myRunnableThread();
        Thread th = new Thread(mr, "thread-1");
        Thread th2 = new Thread(mr, "thread-2");

        try{
            th2.start();
            th2.join();

            th.start();
            th.join();

            System.out.println(Thread.currentThread().getName() +
                    " is continuing after Thread 2 and Thread 1 are done.");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
