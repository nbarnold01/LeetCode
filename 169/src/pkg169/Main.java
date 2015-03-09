/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg169;

/**
 *
 * @author nathanarnold
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] num = new int[]{5,5,1};
        Solution instance = new Solution();
        int expResult = 5;
        int result = instance.majorityElement(num);
        
        System.out.println(Integer.toString(result));
    }
    
}
