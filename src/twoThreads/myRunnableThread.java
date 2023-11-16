package twoThreads;

public class myRunnableThread implements Runnable{

    public void run(){

        try{
            System.out.println(Thread.currentThread().getName() +
                    " is starting... :)");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() +
                    " stops running... :)");
        }

        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
