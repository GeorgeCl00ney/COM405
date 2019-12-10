
package Week12ArrayList;

public class Lorry extends Vehicle 
{
    public Lorry(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }
    @Override
    public double calcFee() 
    {
        if(weight < 8000)
        {
            return 10;
        }
        return 15;
    }  
}
