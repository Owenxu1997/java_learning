package thread;
/**
 * this program demonstrates the sleep method in Thread
 * static void	sleep​(long millis)	Causes the currently executing thread to sleep (temporarily cease execution) 
 * for the specified number of milliseconds
 */

public class SleepTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}

}
