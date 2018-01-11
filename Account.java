public class Account {
	private double balance;
	 private String name;
	 private int acctNum;
	 
	 /**
	  * Constructor -- initializes balance, owner, and account number
	  */
	 public Account(double initBal, String owner, int number) {
		 balance = initBal;
		 name = owner;
		 acctNum = number;
	 }
	 
	 public Account(double initBal, String owner) {
		 balance = initBal;
		 name = owner;
		 acctNum = (int)(1000*Math.random()) + 1000;
	 }
	 
	 public Account(String owner) {
		 name = owner;
		 balance = 0;
		 acctNum = (int)(1000*Math.random()) + 1000;
	 }
	 /**
	  * Checks to see if balance is sufficient for withdrawal.
	  * If so, decrements balance by amount; if not, prints message.
	  */
	 public void withdraw(double amount) {
		 if (balance >= amount) {
			 balance -= amount;
			 System.out.println("Withdraw $" + amount +" from "+name+"'s account. "+
			 "New balance is $" + balance + ".");
		 }
		 else
			 System.out.println("Insufficient funds");
	 }
	 
	 public void withdraw(double amount, double fee) {
		 if(balance>= amount+fee) {
			 balance-=amount+fee;
			 System.out.println("Withdraw $" + amount +"plus $"+fee+
					 "fee from " + name + "'s account. "+
					 "New balance is $" + balance + ".");
		 }
		 else
			 System.out.println("Insufficient funds");
	 }
	 
	 /**
	  * Adds deposit amount to balance.
	  */
	 public void deposit(double amount) {
		 balance += amount;
	 }
	 
	 /**
	  * Returns balance.
	  */
	 public double getBalance() {
		 return balance;
	 }
	/**
	  * Returns account name.
	  */
	 public String getName(){
		 return name;
	 }
	 
	 public String toString() {
		 return name + "'s account number is " + acctNum + ". Balance is $" + 
			    balance + ".";
	 }

}

