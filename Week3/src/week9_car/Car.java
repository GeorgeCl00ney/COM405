

package week9_car;

public class Car {
    //Attributes
    private String make;
    private String model;
    private int year;
    private boolean isMotValid;
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;

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
    
    public void accelerate(int speedIncrease)
    {
        currentSpeed = currentSpeed + speedIncrease;
        fuelLevel = fuelLevel - speedIncrease;
        if(fuelLevel == 0)
                {
                  currentSpeed =  0; 
                }
        else if(currentSpeed > maxSpeed)
                {
                  currentSpeed =  maxSpeed; 
                }
    }
    public void brake(int speedDecrease)
    {
        currentSpeed = currentSpeed - speedDecrease;
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