package SyncLock;

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
