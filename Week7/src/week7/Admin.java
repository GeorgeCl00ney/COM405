
package week7;

public class Admin extends Employee{
    //EXTRA ATTRIBUTES
    private Manager manager;
    
    //Extend the inherited constructor
    public Admin(String nameIn,double payIn, double hoursIn, double holidayIn, Manager managerIn)
    {
        super(nameIn,payIn,hoursIn,holidayIn);
        manager = managerIn;
    }
    //METHODS
        //Getters
    public Manager getManager()
    {
        return manager;
    }
        //Setters
    public boolean setManager(Manager newManager)
    {
        manager = newManager;
        return true;
    }
    
    //adapt top method
    @Override
    public String displayDetails(String nameIn)
    {
        return super.displayDetails(nameIn) + " Manager name: " + manager.getName();
    }
    
}
