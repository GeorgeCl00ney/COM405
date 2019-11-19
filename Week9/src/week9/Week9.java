
package week9;


public class Week9 {

    public static void main(String[] args) {
        //By making the Employee class Abstract I now cannot instantiate an Employee object
        //Employee alice = new Employee("Alice",25000,37,28);
        FrontLine bob = new FrontLine("Bob",18000,25,25);
        Manager david = new Manager("David",50000,37,35,15);
        Admin carol = new Admin("Carol",22000,37,25,david);
        
       //By making the Employee class Abstract I now cannot call the Employee methods directly
       //System.out.println(alice.displayDetails(alice.getName()));
       System.out.println(bob.displayDetails(bob.getName()));
       System.out.println(carol.displayDetails(carol.getName()));
       System.out.println(david.displayDetails(david.getName()));
        
       
       
        
    }
    
}
