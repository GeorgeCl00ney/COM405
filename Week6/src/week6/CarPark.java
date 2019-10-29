
package week6;

public class CarPark {
    
//Start with an array attribute to hold Cars
    private Car[] cars;
    
//Create a constructor which instantiates he array with a limit of 15 cars
    public CarPark()
    {
        cars = new Car[15];
    }
    
//Create a method to allow cars to be added to the CarPark object
    public boolean addCar(Car carIn)
    {
        //Need a loop to find an empty element in the array to put the car into
        for(int i=0; i< cars.length; i+=1)
        {
            //if the space is empty
            if(cars[i] == null)
            {
                //put the car into it
                cars[i] = carIn;
                return true;
            }
        }
        //don't forget to return false if the loop finds no value
        return false;
    }
    
//Similarly Create a method to remove a car from the array
    public boolean removeCar(int carRegIn)
        {
        for(int i=0; i< cars.length; i+=1)
            {   if(cars[i] != null) //Is there anyone in this element?
                {
                    //Is this the car we are looking for?
                    if(cars[i].getRegistration().equals(carRegIn))
                    {
                    cars[i] = null;//Set the seat to empty
                    return true;
                    }
                }
            }  
            return false;
        }  
    
//Create a method to count the Cars and Spaces in the CarPark
    public int countCars()
    {
        //first create a variable to hold the count as it increases...
        int numberOfCars = 0;
        //while we go through the loop and
        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] != null) //if the element has a car in it
            {
               numberOfCars++; //add one to the number of cars
            }
        }
        return numberOfCars; //return number of cars to what called the method
    }
    
//Create a method to count the Spaces in the CarPark
    public int countSpaces()
    {
        /*first create a variable to hold the count as it increases
        and initialise the count as the size of the CarPark*/
        int numberOfSpaces = cars.length;
        //while we go through the loop and
        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] != null) //if the element has a car in it
            {
               numberOfSpaces--; //remove one from the number of spaces
            }
        }
        return numberOfSpaces; //return number of spaces to what called the method
    }
    
    
}
