
/**
 * Write a description of class TransferTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TransferTest
{
    public static void main(String[]args){
        Account acct1 = new Account(100,"John");
        Account acct2 = new Account(100,"Sally");
        System.out.print("\f1 - Transfer from "+acct1.getName()+" to "+ acct2.getName()+
                         "'s account.\n2 - Transfer from " + acct2.getName()+
                         " to " + acct1.getName() +"'s account.\n3 - Quit"+
                         "\nEnter the number to choose an option from above: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while(x<3){
            System.out.print("\nWhat amount would you like to transfer? ");
            int y = scan.nextInt();
            if(x==1)
                acct1.transfer(acct2,y);
            else
                acct2.transfer(acct1,y);
            System.out.println("\nNew balance for "+acct1.getName()+": " +
                                String.format("%.2f",acct1.getBalance()));
            System.out.println("New balance for "+acct2.getName()+": " +
                                String.format("%.2f",acct2.getBalance()));
            System.out.print("\n1 - Transfer from "+acct1.getName()+" to "+ acct2.getName()+
                               "'s account.\n2 - Transfer from " + acct2.getName()+
                               " to " + acct1.getName() +"'s account.\n3 - Quit"+
                               "\nEnter the number to choose an option from above: ");
            x = scan.nextInt();
        }
        System.out.print("\f1 - Transfer from "+acct1.getName()+" to "+ acct2.getName()+
                         "'s account.\n2 - Transfer from " + acct2.getName()+
                         " to " + acct1.getName() +"'s account.\n3 - Quit"+
                         "\nEnter the number to choose an option from above: ");
        x = scan.nextInt();
        while(x<3){
            System.out.println("What amount would you like to transfer? ");
            int y = scan.nextInt();
            System.out.println("\n****** Testing static transfer method ******\n");
            if(x==1)
                Account.transfer(acct1,acct2,y);
            else
                Account.transfer(acct2,acct1,y);
            System.out.println("\nNew balance for "+acct1.getName()+": " +
                                String.format("%.2f",acct1.getBalance()));
            System.out.println("New balance for "+acct2.getName()+": " +
                                String.format("%.2f",acct2.getBalance()));
            System.out.print("\n1 - Transfer from "+acct1.getName()+" to "+ acct2.getName()+
                               "'s account.\n2 - Transfer from " + acct2.getName()+
                               " to " + acct1.getName() +"'s account.\n3 - Quit"+
                               "\nEnter the number to choose an option from above: ");
            x = scan.nextInt();
        }
        System.out.println("Summary: \n"+ acct1 +"\n"+ acct2);
    }
}
