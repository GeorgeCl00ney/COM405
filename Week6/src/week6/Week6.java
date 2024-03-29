/*
Cars in a car park
A well-known retail store is having a problem with one of its car parks.
The car park in question is rather small; it can only accommodate 15 cars.
As a result of its very limited capacity the car park frequently becomes full.
Customers then drive into the car park and become frustrated because they can’t
find a space. Some resort to inconsiderately parking in non-existent spaces.
This obstructs the flow of traffic and sometimes even blocks other car park
users in, leaving them stranded until the inconsiderate parker returns.
Ultimately the store wants to install number plate recognition cameras and a
barrier system to detect how many cars are in the car park and block off access
when the car park is full.
They have approached you to ask if you’d build a prototype for this system.
As the cameras are not currently installed the system will have to be manually
operated.
The user of the system will watch the entrance of the car park.
When a car enters they will type the registration number in to the system.
The system will then add the car to its list of occupants. If the car park is
full then the system should alert the user and the car wishing to enter should
not be added to the car park. When a car leaves the car park the user should
remove said car from the system by entering its registration number. It would
also be useful to see how many spaces are taken and how many are free.

Further Instructions
When the time comes for you to create the main method, the program should work
as follows:
The user should be greeted with a ‘menu’ which will simply be the following
printed out to the screen:
Please select one of the following options:
A – Add a car
B – Remove a car
C – View number of free spaces/number of cars in the car park
 */
package week6;

/**
THOUGHTS
Will need 4 classes
Main method - Will create the menu and business logic
Car Park - will hold 15 Cars, addCar and removeCar method
Car - will hold the details of the car, get and set method
 */
//Import the scanner class so i can use user input
import java.util.Scanner;
public class Week6 
{
    public static void main(String[] args) 
    {
        int state = 1; 
        // Create car park object
        CarPark carPark1 = new CarPark(15);
        //create a Scanner obeject to hold the user choice (outside of loops)
        Scanner menuChoice = new Scanner(System.in);
        // Get user input
        while(state == 1) 
        { 
            // Print menu
            System.out.println("Please select one of the following options:");
            System.out.println("A – Add a car");
            System.out.println("B – Remove a car");
            System.out.println("C – View number of free spaces/number of cars in the car park");
            System.out.println("X – Quit");
            //take the data from the scanner object and place in a variable
            String userChoice = menuChoice.nextLine();
            // Perform actions based on user selection
            if(userChoice.toUpperCase().equals("A"))
            {
                System.out.println("Please enter a registration number");
                String regIn = menuChoice.nextLine();
                System.out.println("Please enter a colour");
                String colourIn = menuChoice.nextLine();
                
                if(carPark1.addCar( new Car(regIn,colourIn)))
                {
                    System.out.println("A car has been added");
                }
                else
                {
                    System.out.println("Car park is full");
                }
            }
            else if(userChoice.toUpperCase().equals("B"))
            {
                System.out.println("Please enter a registration number");
                String regIn = menuChoice.nextLine();
                
                if(carPark1.removeCar(regIn))
                {
                    System.out.println("A car has been removed");
                }
                else
                {
                    System.out.println("Car does not exist");
                }
            }
            else if(userChoice.toUpperCase().equals("C"))
            {
                System.out.println("Spaces available:"+ carPark1.countSpaces());
                System.out.println("Cars present:"+ carPark1.countCars());
            }
            else if(userChoice.toUpperCase().equals("X"))
            {
              System.out.println("The program will now close");
              state = 0;
            }
            else
            {
              System.out.println("That is not a valid choice");
            }
        }
        menuChoice.close(); //Close the scanner
    }
    
}
