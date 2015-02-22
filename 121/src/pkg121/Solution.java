/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg121;

/**
 *
 * @author nathanarnold
 */


/*

Say you have an array for which the ith element is the price of a given 
stock on day i.

If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), design an algorithm to find 
the maximum profit.

Return the max profit

[6,1,3,2,4,7] = 6
[2,1] = 0
[2,1,4] = 3

*/
    
public class Solution {
    
    public int maxProfit(int[] prices) {

        
        if (prices.length > 1) {

            int max = 0;

            int[] profits = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                int maxProfitForItem = 0;
                
                for (int j = i; j < prices.length; j++) {
                    
                    int profitForDay = prices[j] - prices[i];
                    
                    if (profitForDay > maxProfitForItem){
                        maxProfitForItem = profitForDay;
                    }
                }
                
                profits[i] = maxProfitForItem;
                
                if (maxProfitForItem > max) {
                    max = maxProfitForItem;
                }
            }
          
            return max;

        }

        return 0;

    }
}
