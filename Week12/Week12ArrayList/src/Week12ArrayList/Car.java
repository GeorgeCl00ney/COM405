
package Week12ArrayList;

public class Car extends Vehicle
{
    public Car(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }
    @Override
    public double calcFee() {
        
        if(weight > 1590)
        {
            double extra = ((weight-1590)/100)*0.10;
            return 5.0 + extra;            
        }
        return 5.0;
    } 
}
