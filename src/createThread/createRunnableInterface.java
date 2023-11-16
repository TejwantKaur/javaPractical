package createThread;

public class createRunnableInterface implements Runnable{
    public void run(){
        System.out.println("I am in run");
    }

    public static void main(String[] args) {
        createRunnableInterface obj = new createRunnableInterface();
        Thread th = new Thread(obj);

        th.start();
    }
}
