/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg121;

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

    /**
     * Test of maxProfit method, of class Solution.
     */
    @Test
    public void testMaxProfit1() {
        System.out.println("maxProfit");
        int[] prices = new int[]{2, 1};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.maxProfit(prices);
        assertEquals(expResult, result);
    }
    
     @Test
     public void testMaxProfit2() {
        System.out.println("maxProfit");
        int[] prices = new int[]{2, 1, 4};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.maxProfit(prices);
        assertEquals(expResult, result);
    }
     
    @Test
    public void testMaxProfit3() {
        System.out.println("maxProfit");
        int[] prices = new int[]{6,1,3,2,4,7};
        Solution instance = new Solution();
        int expResult = 6;
        int result = instance.maxProfit(prices);
        assertEquals(expResult, result);
    }
    
    
    
    
    
}
