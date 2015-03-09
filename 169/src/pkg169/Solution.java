/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg169;

import java.util.Dictionary;
import java.util.HashMap;



/**
 *
 * @author nathanarnold
 */
public class Solution {

    public int majorityElement(int[] num) {
        HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        
        int length = num.length;
        for (int i = 0; i < length ; i++) {
            
            Integer previousValue = dictionary.get(num[i]);
            
            if (previousValue == null){
                previousValue = 0;
            }
          
            dictionary.put(num[i], ++previousValue);
            
            if (previousValue > length/2) {
                return num[i];
            }
        }
        
        
        Integer highestCount = 0;
        Integer highestValue = num[0];
        
        
        for (Integer key : dictionary.keySet()) {
            
            int currentCount = dictionary.get(key);
            if (currentCount > highestCount) {
                highestValue = key;
                highestCount =  currentCount ;
            }
        }
        
        return highestValue;
                

    }
}
