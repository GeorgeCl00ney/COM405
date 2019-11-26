
package week10;

public class Bridge 
{
    //ATTRIBUTES
    private int vehicleLimit = 20;
    private double weightLimit = 300000;

    //CONSTRUCTOR
    private Vehicle[] vehiclesInTransit = new Vehicle[vehicleLimit];
    
    //METHODS
    public double calcTotalWeight()
    {
        return 10.00; ///Placeholder
    }
    public String addVehicle(Vehicle vehicleIn)
    {
        return "FAILURE reason"; ///Placeholder
    }
    public boolean removeVehicle(Vehicle vehicleIn)
    {
        return true;  //Placeholder
    }
    
}
