/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

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
    public void testTwoSum() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testTwoSum");
        int[] numbers = new int[]{6, 1, 3, 2, 4, 7};
        int target = 7;
        Solution instance = new Solution();
        int[] expResult = new int[]{1, 2};
        int[] result = instance.twoSum(numbers, target);
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);

    }

    @Test
    public void testTwoSumWithThreeValues() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testTwoSum with three values");
        int[] numbers = new int[]{5, 75, 25};
        int target = 100;
        Solution instance = new Solution();
        int[] expResult = new int[]{2, 3};
        int[] result = instance.twoSum(numbers, target);
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);

    }

    @Test
    public void testTwoSumWithZeroValues() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testTwoSum with zeros");
        int[] numbers = new int[]{0, 4, 3, 0};
        int target = 0;
        Solution instance = new Solution();
        int[] expResult = new int[]{1, 4};
        int[] result = instance.twoSum(numbers, target);
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);

    }

    @Test
    public void testTwoSumWithNegativeValues() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("testTwoSum with Negative Values");
        int[] numbers = new int[]{-1, -2, -3, -4, -5};
        int target = -8;
        Solution instance = new Solution();
        int[] expResult = new int[]{3, 5};
        int[] result = instance.twoSum(numbers, target);
        assertEquals(expResult[0], result[0]);
        assertEquals(expResult[1], result[1]);

    }

}
