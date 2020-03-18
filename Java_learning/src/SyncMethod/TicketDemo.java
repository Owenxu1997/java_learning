package SyncMethod;

/**
 * this program demonstrate multi-thread synchronize problem with ticket sales
 * @author owenxu
 * @version 1.0 2020-3-17
 *
 * 1. set a shared resource: ticket
 * 2.
 */

public class TicketDemo {
    public static void main(String[] args) {
        TicketSales sales = new TicketSales();

        Thread s0 = new Thread(sales);
        Thread s1 = new Thread(sales);
        Thread s2 = new Thread(sales);

        s1.start();
        s0.start();
        s2.start();
    }
}
