
/**
 * bank accounts with tranfering
 * 
 * @author ConnieHuang
 * @version 1/11/18
 */
public class Account {
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAccountNum=1000;

    /**
     * Constructor -- initializes balance, owner, and account number
     * @param initBal initial balnce of account
     * @param owner the name of the person who owns the account
     * @param number account number
     */
    public Account(double initBal, String owner, int number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    /**
     * Constructor -- initializes balance, owner, and account number
     * @param initBal initial balnce of account
     * @param owner the name of the person who owns the account
     */
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = nextAccountNum++;
    }

    /**
     * Constructor -- initializes balance, owner, and account number
     * @param owner the name of the person who owns the account
     */
    public Account(String owner) {
        name = owner;
        balance = 0;
        acctNum = nextAccountNum++;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * @param amount amount of money to be withdrawn from account
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + String.format("%.2f",amount) +" from "+name+"'s account. "+
                "New balance is $" + String.format("%.2f",balance) + ".");
        }
        else
            System.out.println("Insufficient funds");
    }

    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * @param amount amount of money to be withdrawn from account
     * @param fee the fee it charges to withdraw money
     */
    public void withdraw(double amount, double fee) {
        if(balance>= amount+fee) {
            balance-=amount+fee;
            System.out.println("Withdraw $" + String.format("%.2f",amount) +" plus $"+
                String.format("%.2f",fee)+" fee from " + name + "'s account. "+
                "New balance is $" + String.format("%.2f",balance) + ".");
        }
        else
            System.out.println("Insufficient funds");
    }

    /**
     * transfers money from one acount to another
     * @param acct the account to transfer money to
     * @param amt the amount that is being transferred
     */
    public void transfer(Account acct, double amt){
        if(amt<this.balance){
            this.withdraw(amt);
            acct.deposit(amt);
            System.out.println("Transferred $"+String.format("%.2f",amt)
                +" from " +name+"'s account to "+
                acct.getName()+"'s account.");
        }
        else
            System.out.println("Insufficient funds.");
    }

    /**
     * static method for transferring money
     * @param acct1 account that money is being withdrawn from
     * @param acct2 account money is being depositted to
     * @param amt the amount being transferred
     */
    public static void transfer(Account acct1, Account acct2, double amt){
        if(amt<acct1.balance){
            acct1.withdraw(amt);
            acct2.deposit(amt);
            System.out.println("Transferred $"+String.format("%.2f",amt)+" from " 
                +acct1.getName()+"'s account to "+
                acct2.getName()+"'s account.");
        }
        else
            System.out.println("Insufficient funds.");
    }

    /**
     * Adds deposit amount to balance.
     * @param amount amount of money to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Returns balance.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns account name.
     * @return account name
     */
    public String getName(){
        return name;
    }

    /**
     * @return the next account number
     */
    public static int getNextNum(){
        return nextAccountNum;
    }

    /**
     * @return a string representaion of object
     */
    public String toString() {
        return name + "'s account number is " + acctNum + ". Balance is $" + 
        String.format("%.2f",balance) + ".";
    }
}
