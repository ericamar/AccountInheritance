
package account.inheritance;

public class SavingsAccount extends Account
{
    //Variables
    private double interest = 1.15;
    
    //Constructor
    public SavingsAccount(double moneys)
    {
        super(moneys);
    }
    
    public double CalculateInterest()
    {
        balance = balance * interest;
        return balance;
    }
    
    
}
