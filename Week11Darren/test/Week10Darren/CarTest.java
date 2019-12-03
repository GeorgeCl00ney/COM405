/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10Darren;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4hainr84
 */
public class CarTest {
    Car c1;
    Car c2;
    Car c3;
    Car c4;
    
    public CarTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
   
    @Before
    public void setUp() {
        c1 = new Car("cc12 34cc",1500);
        c2 = new Car("cc12 34cc",1600);
        c3 = new Car("cc12 34cc",1700);
        c3 = new Car("cc12 34cc",1800);
    }

    @After
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of calcFee method, of class Car.
     */
    @Test
    public void testCalcFee() 
    {
        assertEquals("Car is underweight should charge 5",5.0, c1.calcFee(),0);
        assertEquals("Car is doesn't exceed by 100 kg should charge 5",5.0, c2.calcFee(),0);
        assertEquals("Car is exceeds by 110 kg should charge 5.1",5.1, c3.calcFee(),0);
        assertEquals("Car is exceeds by 210 kg should charge 5.2",5.2, c4.calcFee(),0);
    }
    
}
