package Runnable;
import java.lang.Runnable;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i < 20; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
