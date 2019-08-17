/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.elnurainc.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elnuraamatova
 */
public class CalculatorTest {
    Calculator cal;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cal = new Calculator ();
    }
    
    @After
    public void tearDown() {
    }

    
    
     @Test
     public void testAdd() {
         assertEquals(4, cal.add(2, 2));
         
     }
     @Test
     public void testSub() {
         assertEquals(8, cal.sub(10, 2));
         
     }
}
