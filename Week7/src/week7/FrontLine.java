

package week7;


public class FrontLine extends Employee{
    //Add the inherited constructor
    public FrontLine(String nameIn,double payIn, double hoursIn, double holidayIn)
    {
        super(nameIn,payIn,hoursIn,holidayIn);
    }
    
    @Override
    public double getPay()
    {
        return payRate/52;
    }
}
