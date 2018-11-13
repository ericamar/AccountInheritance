
package account.inheritance;


public class Account 
{
    //Variables
    protected double balance;
    
    //Constructor
    public Account(double moneys)
    {
        if(moneys >= 0)
        {
           balance = moneys;
        }
        
        
    }
    
    public void credit(double moneys)
    {
        if(moneys >= 0)
        {
           balance += moneys;
        }
    }
    
    public void debit(double moneys)
    {
        if(moneys >= 0)
        {
            if(moneys < balance)
            {
                 balance -= moneys;
            }
            else
            {
                System.out.println("Debit amoubt exceeded account balance.");
            }
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
}
