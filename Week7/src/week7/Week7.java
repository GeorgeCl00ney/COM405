
package week7;


public class Week7 {

    public static void main(String[] args) {
        Employee alice = new Employee("Alice",25000,37,28);
        Employee bob = new FrontLine("Bob",18000,25,25);
        Employee carol = new Admin("Carol",22000,37,25,null);
        Employee david = new Manager("David",50000,37,35,15);
        
       alice.getPay();
       bob.getPay();
       carol.getPay();
       david.getPay();
       
        
    }
    
}
