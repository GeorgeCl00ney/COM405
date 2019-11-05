
package week7;

public class Manager extends Employee{
    //EXTRA ATTRIBUTES
    private double bonusPercent;
    
    //Add the inherited constructor
    public Manager(String nameIn,double payIn, double hoursIn, double holidayIn)
    {
        super(nameIn,payIn,hoursIn,holidayIn);
    }
    //Extend the inherited constructor
    public Manager(String nameIn,double payIn, double hoursIn, double holidayIn, double bonusIn)
    {
        super(nameIn,payIn,hoursIn,holidayIn);
        bonusPercent = bonusIn;
    }
    public boolean setBonus(double bonusIn)
    {
        
        if(bonusPercent <= 100 && bonusPercent >= 0)
        {
            bonusPercent = bonusIn;
            return true;
        }
        else 
        return false;
    }
    
    @Override
    public double getPay()
    {
        return (payRate*bonusPercent)/100;
    }
    
}
