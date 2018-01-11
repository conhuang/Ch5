
/**
 * creates 2 bank accounts
 * 
 * @author Connie Huang
 * @version 1/11/2018
 */
public class AccountTest
{
    public static void main(String[] args){
        System.out.print("\f");
        Account acct1 = new Account(1000,"John",1234);
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println(acct1+"\n");
        
        Account acct2 = new Account("Sally");
        acct2.deposit(5000);
        acct2.withdraw(150,2.5);
        acct2.withdraw(5000);
        System.out.println(acct2+"\n");
        
        Account acct3 = new Account(5500,"Tommy");
        acct3.withdraw(500);
        System.out.println(acct3);
    }
}
