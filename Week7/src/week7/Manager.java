
package week7;

public class Manager extends Employee{
    //EXTRA ATTRIBUTES
    private double bonusPercent;
    
    //Extend the inherited constructor
    public Manager(String nameIn,double payIn, double hoursIn, double holidayIn, double bonusIn)
    {
        super(nameIn,payIn,hoursIn,holidayIn);
        bonusPercent = bonusIn;
    }
    
}
