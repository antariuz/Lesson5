package multithreads;

public class Main {

    public static void main(String[] args) {
        //Thread
        MyThread testThread = new MyThread();
        testThread.start();

        //Runnable
        MyRunnable testMyRunnable = new MyRunnable();
        Thread nextTestThread = new Thread(testMyRunnable);
        nextTestThread.start();
        
    }

}
