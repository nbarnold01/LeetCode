/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26;

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
        Solution sol = new Solution();
        
        int[] ar = new int[]{3,4,5,56,7,7,7,7};
       int size = sol.removeDuplicates(ar);
       
       System.out.println(size);
        
    }
    
}
