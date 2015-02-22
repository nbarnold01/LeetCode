/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg121;

import java.lang.reflect.Array;
import pkg121.Solution;

/**
 *
 * @author nathanarnold
 */
public class Main {

    /*
    
    Say you have an array for which the ith element is the price of a given 
    stock on day i.

    If you were only permitted to complete at most one transaction 
    (ie, buy one and sell one share of the stock), design an algorithm to find 
    the maximum profit.
    */
    
    

    /**
     * @param args the command line arguments
     */
    
    private static int test(int[] prices) {
        
        Solution sol = new Solution();
        return sol.maxProfit(prices);                
    }
    
    private static void test1() {
        System.out.print(test(new int[]{6,1,3,2,4,7})+"\n");
    }

    private static void test2() {
        System.out.print(test(new int[]{2, 1})+"\n");
    }

    private static void test3() {
        System.out.print(test(new int[]{2, 1, 4})+"\n");
    }
    public static void main(String[] args) {
        // TODO code application logic here

        test1();
        test2();
        test3();
     
    }

}
