
package account.inheritance;

public class CheckingAccount extends Account
{
    //Variables
    private double transactionFee = .50;
    
    //Constructor
    public CheckingAccount(double moneys)
    {
        super(moneys);
        
    }
    
    @Override   
    public void credit(double moneys)
    {
        if(moneys >= 0)
        {
           balance += moneys;
           balance = balance - transactionFee;
        }
    }
    
    @Override
    public void debit(double moneys)
    {
        if(moneys >= 0)
        {
            if(moneys < balance)
            {
                 balance -= moneys;
                 balance = balance - transactionFee;
            }
            else
            {
                System.out.println("Debit amoubt exceeded account balance.");
            }
        }
    }
}
