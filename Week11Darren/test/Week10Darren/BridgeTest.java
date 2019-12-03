/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10Darren;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;

/**
 *
 * @author 4hainr84
 */
public class BridgeTest {
    Bridge br1;
    Car c1;
    Car c2;
    Car c3;
    Car c4;
    public BridgeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        br1 = new Bridge(10,30000);
        c1 = new Car("asd12 2sd",3456);
        c2 = new Car("qwe12 2rt",1234);
        c3 = new Car("qqq11 1qq",1000);
        c4 = new Car("aaa99 9aa",3000);
    }

    @After
    public void tearDown() throws Exception {
    }
   

    @Test
    public void testCalcTotalWeight() {
        assertEquals(0,br1.calcTotalWeight());//Test weight of empty bridge
        //NEED TO ADD test adding different types of Vehicles
        assumeTrue(1 == br1.addVehicle(c1)); //2 different ways of assuming set up has worked
        assumeThat(1,is(br1.addVehicle(c2))); //2 different ways of assuming set up has worked
        assertEquals(1234+3456,br1.calcTotalWeight());
    }


    @Test
    public void testAddVehicle() {
        //Basic test to add a car
        assertEquals(1,br1.addVehicle(c1));
        //Test to see if bridge reaching car limit refuses entry
        for(int i=1; i<10; i++)
        {
            assumeTrue(1==br1.addVehicle(c3));
        }
        assertEquals(-1,br1.addVehicle(c1));
        //Test to see if bridge reaching weight limit refuses entry
    }
    
    @Test
    public void testAddVehicleWeight() {
        //Test to see if bridge reaching weight limit refuses entry
        for(int i=1; i<=9; i++)
        {
            assumeTrue(1==br1.addVehicle(c4));
        }
        assertEquals(0,br1.addVehicle(c1));
    }


    @Test
    public void testRemoveVehicle() {
        //Test to see if trying to remove a car that is not on the bridge fails
        assertFalse(br1.removeVehicle("asd"));
        assumeTrue(1 == br1.addVehicle(c1));
        //Test again to see if trying to remove a car that is not on the bridge fails
        assertFalse(br1.removeVehicle("asd"));
        
        //Test to see if trying to remove a car that is on the bridge works
        assertTrue(br1.removeVehicle("asd12 2sd"));
    }

    
}
