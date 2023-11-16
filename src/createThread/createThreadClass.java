package createThread;

public class createThreadClass extends Thread{
    public void run(){
        System.out.println("I am in run");
    }

    public static void main(String[] args) {
        createThreadClass th = new createThreadClass();
        th.start(); // --> calls run meth
    }

}
