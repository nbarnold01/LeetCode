/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26;

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
     * Test of removeDuplicates method, of class Solution.
     */
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        int[] A = new int[]{1, 2};
        Solution instance = new Solution();
        int expResult = 2;
        int result = instance.removeDuplicates(A);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(A[0], 1);
        assertEquals(A[1], 2);

    }
    
}
