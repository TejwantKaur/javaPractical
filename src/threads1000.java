
class MyRunnable implements Runnable {
    public void run() {
        // Perform some task in the thread
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}
public class threads1000 {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }


}
