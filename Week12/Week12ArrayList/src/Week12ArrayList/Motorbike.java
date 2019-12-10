
package Week12ArrayList;

public class Motorbike extends Vehicle 
{
    public Motorbike(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }
    @Override
    public double calcFee() {
        return 3.0;
    }
}
