package Sync;

public class TicketSales implements Runnable {
    //定义共享数据
    private int ticket = 100;
    //创建锁对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        while(ticket > 1){
            //创建同步代码块
            synchronized (obj){
                System.out.println(Thread.currentThread().getName() + " is selling No." + ticket + " ticket");
                ticket--;
            }
        }
    }
}
