
package week10;

public class Car extends Vehicle
{
    //ATTRIBUTES
    double chargeIncrement = 0.10;
    double chargeFloor = 5.00;
    double weightIncrement = 100;
    double weightFloor = 1590;

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
