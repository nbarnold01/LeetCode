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
//two pointers minIndex, max Index
//maxIndex is the runner
//minIndex stays put until we find a smaller value
//if a smaller value is found, minIndex = value
//update the maxProfit for this run
//should run in n time with constant space
public class Solution {

    public int maxProfit(int[] prices) {

        int pricesLength = prices.length;

        if (pricesLength > 1) {

            int totalMaxProfit = 0;

            int minIndex = 0;
            int maxIndex = 0;

            for (int i = 0; i < pricesLength; i++) {

                if (prices[i]>prices[maxIndex]) {
                    maxIndex = i;
                } else if (prices[i]<prices[minIndex]) {
                    minIndex = i;
                    maxIndex = i;
                }
                
                if (prices[maxIndex] - prices[minIndex] > totalMaxProfit) {
                    totalMaxProfit = prices[maxIndex] - prices[minIndex];
                }
            }

            return totalMaxProfit;

        }

        return 0;

    }
}
