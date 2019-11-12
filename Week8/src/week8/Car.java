
package week8;

public class Car {
    //ATTRIBUTES
    private String registration;
    private String colour;
    //CONSTRUCTOR
    public Car(String regIn, String colourIn)
    {
        registration = regIn;
        colour = colourIn;
    }
    //METHODS
    public String getRegistration()
    {
        return registration;
    }
    public String getColour()
    {
        return colour;
    }
}
