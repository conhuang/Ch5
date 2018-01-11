
/**
 * tests bank accounts
 * 
 * @author Connie Huang
 * @version 1/11/18
 */
import java.util.*;
public class AccountTest2
{
    public static void main(String[] args){
        System.out.print("\fHow many accounts will you be creating? ");
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        for(int i = 1; i <= x; i++){
            System.out.print("\nEnter the name of account #" + i +": ");
            Account acct = new Account(100,scan.next());
            System.out.println("\n"+acct+"\nNext id number is: "+Account.getNextNum());
        }
        System.out.println("\nEnd of program. Goodbye.");
    }
}
