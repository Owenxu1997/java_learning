package BankAccount;

/**
 * transfers money from one account to another
 */

public class TransferRunnable implements Runnable {
    private Bank bank;
    private int from;
    private int to;
    private double max;

    TransferRunnable(Bank b, int f, double m){
        bank = b;
        from = f;
        max = m;
    }

    @Override
    public synchronized void run() {
        to = (int) (bank.getSize() * Math.random());
        double amount = max * Math.random();
        bank.transfer(from, to, amount);
    }
}
