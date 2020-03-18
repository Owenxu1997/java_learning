package BankAccount;

/**
 * this program demonstrate the synchronized thread with a sample of bank transfer
 * @author owenxu
 * @version 1.0 2020-3-17
 */

public class TransferDemo {
    public final static int NACCOUNTS = 100;
    public final static double INITBALENCE = 1000;

    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS,INITBALENCE);

            TransferRunnable r = new TransferRunnable( b, 1, INITBALENCE);
            Thread t = new Thread(r);
            t.start();

    }
}
