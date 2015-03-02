/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg65;

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
     * Test of isNumber method, of class Solution.
     */
    @Test
    public void testIsNumberEmptyString() {
        System.out.println("\"\"");
        String s = "";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberZero() {
        System.out.println("0");
        String s = "0";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberDecimal() {
        System.out.println("0.1");
        String s = "0.1";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadDecimal2() {
        System.out.println(".e1");
        String s = ".e1";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberLetters() {
        System.out.println("abc");
        String s = "abc";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberLettersAndNumbers() {
        System.out.println("1 a");
        String s = "1 a";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberLeadingAndTrailingWhiteSpace() {
        System.out.println(" 1 ");
        String s = " 1 ";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberScientificNotation() {
        System.out.println("2e10");
        String s = "2e10";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberHex() {

        //Hex Notation
        System.out.println("0xa5");
        String s = "0xa5";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadHex() {

        //Hex Notation
        System.out.println("0xap");
        String s = "0xap";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberNegative() {

        //Hex Notation
        System.out.println("-1");
        String s = "-1";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadExponent1() {

        //Hex Notation
        System.out.println("e");
        String s = "e";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberExponent2() {

        //Hex Notation
        System.out.println("2e0");
        String s = "2e0";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadExponent2() {

        //Hex Notation
        System.out.println("e11");
        String s = "e11";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadExponent3() {

        //Hex Notation
        System.out.println("1e.");
        String s = "1e.";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadDecimal() {

        //Hex Notation
        System.out.println(".");
        String s = ".";
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberPlus() {

        //Hex Notation
        System.out.println("+.8");
        String s = "+.8";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadExponent4() {

        System.out.println("46.e3");
        String s = "46.e3";
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberBadExponent5() {

        String s = "6e6.5";
        System.out.println(s);
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNumberExponent6() {

        String s = " 005047e+6";
        System.out.println(s);
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }
        @Test
    public void testIsNumberBadExponent7() {

        String s = "4e+";
        System.out.println(s);
        Solution instance = new Solution();
        boolean expResult = false;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }
    
    
    
            @Test
    public void testIsNumberExponent8() {

        String s = "32.e-80123";
        System.out.println(s);
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.isNumber(s);
        assertEquals(expResult, result);
    }
}
