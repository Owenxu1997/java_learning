package ThreadTest;
import java.util.*;

public class ThreadTest  extends Thread{

    ThreadTest(){

    }

    ThreadTest(String name){
        super.setName(name);
    }

    @Override
    public void run() {
        System.out.println("hello im a new thread");
        for(int i = 1; i < 20; i++){
            System.out.println(currentThread().getName() + "-->" + i);
        }
    }
}
