/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nathanarnold
 */
public class SolutionTest {

    public SolutionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testValidString() {

        System.out.println("testValidString");

        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isValid("{([])}");
        assertEquals(expResult, result);
    }

    @Test
    public void testOddNumberOfCharacters() {

        System.out.println("testOddNumberOfCharacters");

        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isValid("{)}");
        assertEquals(expResult, result);
    }

    @Test
    public void testImproperClosing() {

        System.out.println("testImproperClosing");

        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isValid("[{)(}]");
        assertEquals(expResult, result);
    }
}
