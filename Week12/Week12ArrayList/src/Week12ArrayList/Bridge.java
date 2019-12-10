
package Week12ArrayList;

import java.util.ArrayList;

public class Bridge 
{
    private int vehicleLimit;
    private int weightLimit;
//    private Vehicle[] onBridge;
    private ArrayList<Vehicle> onBridge;
    
    public Bridge(int limit, int maxWeight)
    {
        vehicleLimit = limit;
        weightLimit = maxWeight;
        onBridge = new ArrayList<>(vehicleLimit);
    }
    
    public int calcTotalWeight()
    {
        int tally = 0;
        for(Vehicle v1:onBridge)
        {
            tally += v1.getWeight();
        }
        return tally;
    }
    
    public int addVehicle(Vehicle veh)
    {
        if(onBridge.size() == vehicleLimit)
        {
            return -1;
        }
        else if(calcTotalWeight() + veh.getWeight() < weightLimit)
        {
            onBridge.add(veh);
            return 1;
        }
        return 0;
    }
    
    public boolean removeVehicle(String reg)
    {
        for(Vehicle v1:onBridge)
        {
            if(v1.getReg().equals(reg))
            {
                onBridge.remove(v1);
                return true;
            }
        }
        return false;
    }
}
