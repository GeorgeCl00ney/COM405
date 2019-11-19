/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_car;

/*
Task 1 – Creating a Car Class
First, we will create a class.
We will later use this to create car objects.
 */
public class Car {
    //Attributes
    private String make;
    private String model;
    private int year;
    private boolean isMotValid;
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
/*
Task 1.2 - Getter Methods
For every attribute in your class, create a getter method
Task 1.3 - Setter Methods
For every attribute in your class, create a setter method
*/
//getter methods
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public boolean getIsMotValid()
    {
        return isMotValid;
    }
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getFuelLevel()
    {
        return fuelLevel;
    }
    //setter methods
    public void setMake(String makeIn)
    {
        make = makeIn;
    }
    public void setModel(String modelIn)
    {
        model = modelIn;
    }
    public void setYear(int yearIn)
    {
        year = yearIn;
    }
    public void setIsMotValid(boolean isMotValidIn)
    {
        isMotValid = isMotValidIn;
    }
    public void setCurrentSpeed(int currentSpeedIn)
    {
        currentSpeed = currentSpeedIn;
    }
    public void setMaxSpeed(int maxSpeedIn)
    {
        maxSpeed = maxSpeedIn;
    }
    public void setFuelLevel(int fuelLevelIn)
    {
        fuelLevel = fuelLevelIn;
    }
    /*
    Task 1.4 - Methods
    Create the following methods
    1. accelerate – increases the current speed of the car,
    decreases the fuel level
    2. brake – decreases the current speed of the car
    3. refuel – increases the fuel level of the car
    */
    public void accelerate(int speedIncrease)
    {
        // 1. accelerate – increases the current speed of the car
        // , decreases the fuel level
        //currentSpeed +=1;
        //fuelLevel -=1;
        /*
        **FURTHER TASKS 1
        1. Modify the accelerate method so that it takes an integer
        as a parameter, this will determine how much the current
        speed is increased by. Alter the main method appropriately.
        */
        currentSpeed = currentSpeed + speedIncrease;
        fuelLevel = fuelLevel - speedIncrease;
        /*
        3. The current speed should not exceed the maximum speed of 
        the car. Modify the accelerate method to ensure this does not
        happen. Test in the main method.*/
        if(fuelLevel == 0)
                {
                  currentSpeed =  0; 
                }
        else if(currentSpeed > maxSpeed)
                {
                  currentSpeed =  maxSpeed; 
                }
        /*
        5. If the fuel level is zero, the car should not be able to
        accelerate. Modify the accelerate method so that the current
        speed is, instead, reset to zero should the car have no fuel.
        Test in the main method.
        */
        
    }
    public void brake(int speedDecrease)
    {
    //currentSpeed -=1;
        /*
        **FURTHER TASKS 1
        2. Add the same modification to the brake method.
        Alter the main method appropriately.
        */
        currentSpeed = currentSpeed - speedDecrease;
        /*
        4. The current speed cannot fall below zero, modify
        the brake method to ensure this does not happen.
        Test in the main method.
        */
        if(currentSpeed < 0)
                {
                  currentSpeed = 0; 
                }
    }
    public void refuel(int fuelIn)
    {
    fuelLevel = fuelLevel + fuelIn;
    if(fuelLevel > 100)
        {
            fuelLevel = 100;
        }
    }
/*
***Task 2 – Constructors***
Now we will be adding constructors to our class.
Task 2.1 – Constructor without Parameters
Add a constructor that takes no parameters to your class.
Task 2.2 – Constructor with parameters
Add a constructor that takes parameters to your class.
*/
    public Car()
        {
            make = "Wacky Racer";
            model = "Compact Pussycat";
            year = 1968;
            isMotValid = true;
            currentSpeed = 0;
            maxSpeed = 79;
            refuel(100);
        }
    public Car(String modelIn, int maxSpeedIn)
        {
            make = "Wacky Racer";
            model = modelIn;
            year = 1968;
            isMotValid = true;
            currentSpeed = 0;
            maxSpeed = maxSpeedIn;
            refuel(100);
        }
}