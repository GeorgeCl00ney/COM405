
package week10;

public class Lorry extends Vehicle
{
    //ATTRIBUTES
    private double chargeIncrement = 5.00;
    private double chargeFloor = 10.00;
    private double weightFloor = 8000;

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
