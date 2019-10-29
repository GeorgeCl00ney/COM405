/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4hainr84
 */
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
