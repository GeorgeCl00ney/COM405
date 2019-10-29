
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
}
