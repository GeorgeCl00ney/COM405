
package Week12ArrayList;

public abstract class Vehicle 
{
    protected String reg;
    protected int weight;
    
    public Vehicle(String regIn, int weightIn)
    {
        reg = regIn;
        weight= weightIn;
    }
    public String getReg()
    {
        return reg;
    }
    public int getWeight()
    {
        return weight;
    }
    public abstract double calcFee();
}
