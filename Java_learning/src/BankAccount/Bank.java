package BankAccount;

/**
 * a bank class
 * @version 1.0 2020-3-17
 * @author owenxu
 */

public class Bank {
    private final double[] accounts;

    public Bank(int amount, double initBalance){
        accounts = new double[amount];
        for(int i = 1; i < amount; i++){
            accounts[i] = initBalance;
        }
    }

    /**
     * a method that transfers an certain amount of money form one accoune to another
     * @param from the account money comes from
     * @param to the account money goes to
     * @param value the amount of money transferred
     */
    public synchronized void transfer(int from, int to, double value){
        if(accounts[from] >= value){
            System.out.println(Thread.currentThread().getName());
            accounts[from] -= value;
            System.out.printf("Transfer %10.2f from No.%d to No.%d%n", value, from, to);
            accounts[to] += value;
            System.out.printf("The balance of No.%d: %10.2f%n", to, getBalance(to));;
            System.out.printf("The balance of No.%d: %10.2f%n", from, getBalance(from));;
        }
        else return;
    }

    /**
     *get the total balance
     * @return returns the total balance of the account
     */
    public double getTotalBalance(){
        double sum = 0;

        for(double i : accounts)
            sum += i;

        return sum;
    }

    public double getBalance(int i){
        return accounts[i];
    }

    /**
     * gets the size of accounts
     * @return
     */
    public int getSize(){
        return accounts.length;
    }
}
