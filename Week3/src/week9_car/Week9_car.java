
package week9_car;

public class Week9_car {

    public static void main(String[] args) {
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
