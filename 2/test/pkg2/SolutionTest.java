/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

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
     * Test of addTwoNumbers method, of class Solution.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("add Two Single Digit Numbers Less than ten \n");
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4);
        Solution instance = new Solution();
        ListNode expResult = new ListNode(9);
        ListNode result = instance.addTwoNumbers(l1, l2);
        ListNode newResult = result;

        while (newResult != null) {
            System.out.println(" ->" + newResult.val);
            newResult = newResult.next;
        }

        assertEquals(expResult.val, result.val);
    }

    @Test
    public void testAddTwoNumbersGreaterThanTen() {
        System.out.println("add Two Single Digit Numbers Greater than ten \n");
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(6);
        Solution instance = new Solution();
        ListNode expResult = new ListNode(2);
        expResult.next = new ListNode(1);
        ListNode result = instance.addTwoNumbers(l1, l2);
        ListNode newResult = result;

        while (newResult != null) {
            System.out.println(" ->" + newResult.val);
            assertEquals(expResult.val, newResult.val);
            expResult = expResult.next;
            newResult = newResult.next;
        }

        assertNull(expResult);
        assertNull(newResult);

    }

    @Test
    public void testAddTwoThreeDigitNumbers() {

        System.out.println("add Two Three Digit Numbers\n");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution instance = new Solution();
        ListNode expResult = new ListNode(7);
        expResult.next = new ListNode(0);
        expResult.next.next = new ListNode(8);

        ListNode result = instance.addTwoNumbers(l1, l2);
        ListNode newResult = result;

        while (newResult != null) {
            System.out.println(" ->" + Integer.toString(newResult.val));
            assertEquals(expResult.val, newResult.val);
            expResult = expResult.next;
            newResult = newResult.next;
        }

        assertNull(expResult);
        assertNull(newResult);
    }

    @Test
    public void testAddTwoUnEvenNumbers() {

        System.out.println("add Two numbers where one is longer than the others\n");
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(9);

        Solution instance = new Solution();
        ListNode expResult = new ListNode(8);
        expResult.next = new ListNode(2);
        expResult.next.next = new ListNode(9);

        ListNode result = instance.addTwoNumbers(l1, l2);
        ListNode newResult = result;

        while (newResult != null) {
            System.out.println(" ->" + newResult.val);
            assertEquals(expResult.val, newResult.val);
            expResult = expResult.next;
            newResult = newResult.next;
        }

        assertNull(expResult);
        assertNull(newResult);

    }

}
