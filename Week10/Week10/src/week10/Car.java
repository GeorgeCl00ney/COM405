
package week10;

public class Car extends Vehicle
{
    //ATTRIBUTES
    private double chargeIncrement = 0.10;
    private double chargeFloor = 5.00;
    private double weightIncrement = 100;
    private double weightFloor = 1590;

    //CONSTRUCTOR
    public Car(String regIn, double weightIn) 
    {
        super(regIn, weightIn);
    }
    
    //Override the Abstract method from the parent class
    @Override
    public double CalculateFee() 
    {
        if(weight < weightFloor + weightIncrement)
        {
            return chargeFloor;
        }
        return (((int)((weight - weightFloor)/weightIncrement))*chargeIncrement)+chargeFloor;
    }
}
