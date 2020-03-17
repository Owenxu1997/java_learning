package ThreadTest;

public class mainThread {
    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest("owen");
        tt.start();
        for(int i = 1; i < 20; i++ ){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}