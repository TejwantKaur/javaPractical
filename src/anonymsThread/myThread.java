package anonymsThread;

public class myThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }

}