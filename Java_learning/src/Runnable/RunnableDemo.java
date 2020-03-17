package Runnable;

/**
 * this program demonstrates the implementation of Runnable to enable a thread
 * @author owenxu
 * @version 1.0 2020-3-16
 *
 * 1.create a class that implements Runnable, and override the run() method to set thread task
 * 2.create an object of the implementation of Runnable
 * 3.pass the object to the Thread constructor
 * 4.call start() of Thread object to start a new thread and execute run()
 */

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl rt = new RunnableImpl();
        Thread t = new Thread(rt);
        t.setName("Owen");
        t.start();
    }
}