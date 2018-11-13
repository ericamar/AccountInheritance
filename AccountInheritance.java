
package account.inheritance;


public class AccountInheritance 
{
    public static void main(String[] args) 
    {
        CheckingAccount checking = new CheckingAccount(500);
        checking.credit(500);
        checking.debit(50);
        System.out.println("Checking acc balance: " + checking.getBalance());
        
        SavingsAccount savings = new SavingsAccount(1000);
        savings.credit(savings.CalculateInterest());
        System.out.println("Savings acc balance: " + savings.getBalance());
       
    }
    
}
