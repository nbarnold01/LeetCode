/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

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
     * Test of removeElement method, of class Solution.
     */
    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        int[] A = new int[] {1,2,3,4,4,5};
        Solution instance = new Solution();
        int expResult = 4;
        int result = instance.removeElement(A, 4);
        
        assertEquals(expResult, result);

        assertEquals(A[0], 1);
        assertEquals(A[1], 2);
        assertEquals(A[2], 3);
        assertEquals(A[3], 5);

    }
    
}
