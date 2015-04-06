/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

/**
 *
 * @author nathanarnold
 */
public class Solution {

    
    private void shiftArrayLeft(int[] A, int fromIndex) {

        for (int i = fromIndex; i < A.length-1; i++) {
         
            A[i] = A[i+1];
        }
        
    }
    
    public int removeElement(int[] A, int elem) {


        int length = A.length;
        int newLength = 0;

        while (newLength < length) {

            if (A[newLength] == elem) {

                                //shift elements left
                
                this.shiftArrayLeft(A, newLength);
                length --;
                
                
            } else {
                newLength++;

            }

        }


        
        return newLength;
        
    }
}
