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
public class LorryTest {
    
    Lorry l1;
    Lorry l2;
    Lorry l3;
    
    public LorryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    

    
    @Before
    public void setUp() 
    {
        l1 = new Lorry("mm11 1m",8000);
        l2 = new Lorry("rr11 1r",7999);
    }

    @After
    public void tearDown() throws Exception {
    }


    /**
     * Test of calcFee method, of class Lorry.
     */
    @Test
    public void testCalcFee() {
        assertEquals(15.0,l1.calcFee(),0);
        assertEquals(10.0,l2.calcFee(),0);
    }
    
}
