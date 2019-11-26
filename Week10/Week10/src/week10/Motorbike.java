
package week10;

public class Motorbike extends Vehicle
{
    //ATTRIBUTES
    private double fixedprice = 3.00;

    public Motorbike(String regIn, double weightIn) 
    {
        super(regIn, weightIn);
    }

    //Override the Abstract method from the parent class
    @Override
    public double CalculateFee() 
    {
        return fixedprice;
    }
}
