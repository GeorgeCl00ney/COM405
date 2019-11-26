
package week10;
//MAKE CLASS ABSTRACT so cannot be instantiated
public abstract class Vehicle 
{
    //ATTRIBUTES make protected so that can be seen from child classes
    protected String registration;
    protected double weight;
    
    //CONSTRUCTOR
    public Vehicle(String regIn, double weightIn)
    {
        registration = regIn;
        weight = weightIn;
    }
    
    //METHODS
    //Getters
    public String getReg()
    {
        return registration;
    }
    public double getWeight()
    {
        return weight;
    }
    //ABSTRACT METHOD so must be created in any child class
    public abstract double CalculateFee();
}
