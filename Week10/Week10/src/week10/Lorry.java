
package week10;

public class Lorry extends Vehicle
{
    //ATTRIBUTES
    double chargeIncrement = 5.00;
    double chargeFloor = 10.00;
    double weightFloor = 8000;

    //CONSTRUCTOR
    public Lorry(String regIn, double weightIn) 
    {
        super(regIn, weightIn);
    }
    
    //Override the Abstract method from the parent class
    @Override
    public double CalculateFee() 
    {
        if(weight < weightFloor)
        {
            return chargeFloor;
        }
        return (chargeIncrement+chargeFloor);
    }

}
