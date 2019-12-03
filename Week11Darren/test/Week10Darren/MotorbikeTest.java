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
public class MotorbikeTest {
    
    Motorbike m1;
    
    public MotorbikeTest() {
    }

    @Before
    public void setUpClass() 
    {
        m1 = new Motorbike("mm11 1m",500);
    }

  
    @Test
    public void testCalcFee() {
        assertEquals(3.0, m1.calcFee(),0.001);
    }
    
}
