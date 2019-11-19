/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_car;

/**
 *
 * @author 4hainr84
 */
public class Week9_car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Task 1.5 – Main Method
        Create a main method in which you will:
        1. Create at least 2 car objects
        2. Assign them values using the setter methods
        3. Output the value of their attributes to the screen
        4. Manipulate the values using the various methods you created earlier
        5. Output the values again to ensure they have changed.
         */
       
       /*
       Car c1 = new Car();
       Car c2 = new Car();
       c1.setMake("Ford");
       c1.setModel("Prefect");
       c1.setYear(1975);
       c1.setIsMotValid(false);
       c1.setCurrentSpeed(42);
       c1.setMaxSpeed(88);
       c1.setFuelLevel(24);
       c2.setMake("DMC");
       c2.setModel("Delorean");
       c2.setYear(1956);
       c2.setIsMotValid(false);
       c2.setCurrentSpeed(87);
       c2.setMaxSpeed(120);
       c2.setFuelLevel(80);
       System.out.println("The attributes of Car 1 are currently:");
       System.out.println("Make: "+c1.getMake());
       System.out.println("Model: "+c1.getModel());
       System.out.println("Year of manufacture: "+c1.getYear());
       System.out.println("Is MOT valid?: "+c1.getIsMotValid());
       System.out.println("Current speed: "+c1.getCurrentSpeed());
       System.out.println("Max Speed: "+c1.getMaxSpeed());
       System.out.println("Fuel level: "+c1.getFuelLevel());
       System.out.println("The attributes of Car 2 are currently:");
       System.out.println("Make: "+c2.getMake());
       System.out.println("Model: "+c2.getModel());
       System.out.println("Year of manufacture: "+c2.getYear());
       System.out.println("Is MOT valid?: "+c2.getIsMotValid());
       System.out.println("Current speed: "+c2.getCurrentSpeed());
       System.out.println("Max Speed: "+c2.getMaxSpeed());
       System.out.println("Fuel level: "+c2.getFuelLevel());
       c1.accelerate(10);
       c2.brake(2);
       c2.brake(3);
       c2.brake(5);
       c2.refuel();
       System.out.println("The attributes of Car 1 are currently:");
       System.out.println("Make: "+c1.getMake());
       System.out.println("Model: "+c1.getModel());
       System.out.println("Year of manufacture: "+c1.getYear());
       System.out.println("Is MOT valid?: "+c1.getIsMotValid());
       System.out.println("Current speed: "+c1.getCurrentSpeed());
       System.out.println("Max Speed: "+c1.getMaxSpeed());
       System.out.println("Fuel level: "+c1.getFuelLevel());
       System.out.println("The attributes of Car 2 are currently:");
       System.out.println("Make: "+c2.getMake());
       System.out.println("Model: "+c2.getModel());
       System.out.println("Year of manufacture: "+c2.getYear());
       System.out.println("Is MOT valid?: "+c2.getIsMotValid());
       System.out.println("Current speed: "+c2.getCurrentSpeed());
       System.out.println("Max Speed: "+c2.getMaxSpeed());
       System.out.println("Fuel level: "+c2.getFuelLevel());
       */
       
       
       /*
       ***Task 2 – Constructors***
       Task 2.3 – Main Method
       Modify your main method so that it makes use of the
       new constructors. Make sure both are tested and you
       print the values of each attribute to the screen to
       ensure they work.
       */
       Car c3 = new Car();
       Car c4 = new Car("Creepy Coup",999);
       System.out.println("The attributes of Car 3 are currently:");
       System.out.println("Make: "+c3.getMake());
       System.out.println("Model: "+c3.getModel());
       System.out.println("Year of manufacture: "+c3.getYear());
       System.out.println("Is MOT valid?: "+c3.getIsMotValid());
       System.out.println("Current speed: "+c3.getCurrentSpeed());
       System.out.println("Max Speed: "+c3.getMaxSpeed());
       System.out.println("Fuel level: "+c3.getFuelLevel());
       System.out.println("The attributes of Car 4 are currently:");
       System.out.println("Make: "+c4.getMake());
       System.out.println("Model: "+c4.getModel());
       System.out.println("Year of manufacture: "+c4.getYear());
       System.out.println("Is MOT valid?: "+c4.getIsMotValid());
       System.out.println("Current speed: "+c4.getCurrentSpeed());
       System.out.println("Max Speed: "+c4.getMaxSpeed());
       System.out.println("Fuel level: "+c4.getFuelLevel());
//       c3.refuel();
//       c4.refuel();
//       c3.accelerate(5);
//       c3.accelerate(10);
       c3.accelerate(90);
       System.out.println("The attributes of Car 3 are currently:");
       System.out.println("Make: "+c3.getMake());
       System.out.println("Model: "+c3.getModel());
       System.out.println("Year of manufacture: "+c3.getYear());
       System.out.println("Is MOT valid?: "+c3.getIsMotValid());
       System.out.println("Current speed: "+c3.getCurrentSpeed());
       System.out.println("Max Speed: "+c3.getMaxSpeed());
       System.out.println("Fuel level: "+c3.getFuelLevel());
       c3.brake(95);
       System.out.println("The attributes of Car 3 are currently:");
       System.out.println("Make: "+c3.getMake());
       System.out.println("Model: "+c3.getModel());
       System.out.println("Year of manufacture: "+c3.getYear());
       System.out.println("Is MOT valid?: "+c3.getIsMotValid());
       System.out.println("Current speed: "+c3.getCurrentSpeed());
       System.out.println("Max Speed: "+c3.getMaxSpeed());
       System.out.println("Fuel level: "+c3.getFuelLevel());
       c4.accelerate(99);
       System.out.println("The attributes of Car 4 are currently:");
       System.out.println("Make: "+c4.getMake());
       System.out.println("Model: "+c4.getModel());
       System.out.println("Year of manufacture: "+c4.getYear());
       System.out.println("Is MOT valid?: "+c4.getIsMotValid());
       System.out.println("Current speed: "+c4.getCurrentSpeed());
       System.out.println("Max Speed: "+c4.getMaxSpeed());
       System.out.println("Fuel level: "+c4.getFuelLevel());
       c4.accelerate(1);
       System.out.println("The attributes of Car 4 are currently:");
       System.out.println("Make: "+c4.getMake());
       System.out.println("Model: "+c4.getModel());
       System.out.println("Year of manufacture: "+c4.getYear());
       System.out.println("Is MOT valid?: "+c4.getIsMotValid());
       System.out.println("Current speed: "+c4.getCurrentSpeed());
       System.out.println("Max Speed: "+c4.getMaxSpeed());
       System.out.println("Fuel level: "+c4.getFuelLevel());
       
    }
    
}
