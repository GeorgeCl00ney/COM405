
package week9;

public abstract class Employee {
    //ATTRIBUTES
    protected String name;
    protected double payRate;
    protected double weeklyHours;
    protected double holidayEntitlement;
    
    //CONSTRUCTOR
    public Employee(String nameIn,double payIn, double hoursIn, double holidayIn)
    {
        name = nameIn;
        payRate = payIn;
        weeklyHours = hoursIn;
        holidayEntitlement = holidayIn;
    }
    
    //METHODS
        //Getters
    public String getName()
    {
        return name;
    }
    
    
    //REWRITE THIS AS AN ABSTRACT METHOD!!! 
    public double getPay()
    {
        return payRate;
    }
    
    
    
    
    
    public double getHours()
    {
        return weeklyHours;
    }
    public double getHoliday()
    {
        return holidayEntitlement;
    }
        //Operations
    public boolean changePay(double newPay)
    {
        payRate = newPay;
        return true;
    }
    public boolean changeHours(double newHours)
    {
        weeklyHours = newHours;
        return true;
    }
    public boolean bookHoliday(double leaveTaken)
    {
        if(holidayEntitlement - leaveTaken >=0)
        {
            holidayEntitlement = holidayEntitlement - leaveTaken;
            return true;
        }
        else
        {
            return false;
        }
    }
    public String displayDetails(String nameIn)
    {
        String staffDetails = "";
        staffDetails += "\nEmployee name: " + getName();
        staffDetails += "\nPay rate: " + getPay();
        staffDetails += "\nWeekly hours: " + getHours();
        staffDetails += "\nHoliday entitlement: " + getHoliday();
        
        return staffDetails;
    }
}
