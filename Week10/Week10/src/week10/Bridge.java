
package week10;

public class Bridge 
{
    //ATTRIBUTES
    private int vehicleLimit;    // = 20;
    private double weightLimit;    // = 300000;
    private Vehicle[] vehiclesInTransit;
    

    //CONSTRUCTOR
    public Bridge(int limitIn, double weightIn)
    {
        vehicleLimit = limitIn;
        weightLimit = weightIn;
        vehiclesInTransit = new Vehicle[vehicleLimit];
    }
    
    //METHODS
    public double calcTotalWeight()
    {
        double cumulativeWeight = 0;
        for(int i = 0; i < vehiclesInTransit.length; i++)
        {
            if(vehiclesInTransit[i] != null)
            {
                cumulativeWeight +=  vehiclesInTransit[i].getWeight();
            }
        }
        return cumulativeWeight;
    }
    public String addVehicle(Vehicle vehicleIn)
    {
        String messageOut = "";
        if(calcTotalWeight() + vehicleIn.getWeight() >= weightLimit)
        {
            messageOut += "This Vehicle cannot be added as the Bridge will be over the weight limit.";
            return messageOut; 
        }
        else for(int i = 0; i < vehiclesInTransit.length; i++) ///This might be where it's broken
        {
            if(vehiclesInTransit[i] == null)
            {
                vehiclesInTransit[i] = vehicleIn;
                messageOut +=  "Vehicle has been added";
                return messageOut;
            }
        }
        messageOut +=  "The bridge is full";
        return messageOut;
    }    

    public boolean removeVehicle(Vehicle vehicleIn)
    {
        for(int i = 0; i < vehiclesInTransit.length; i++)
        {
            if(vehiclesInTransit[i] == null)
            {
                if(vehicleIn.getReg() == vehiclesInTransit[i].getReg())
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
