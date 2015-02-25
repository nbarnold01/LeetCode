/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author nathanarnold
 */
import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);

        int length = numbers.length;

        for (int i = length - 1; i >= 0; --i) {

            if ((target >= 0 && sortedNumbers[i] <= target) || (target < 0 && sortedNumbers[i]> target)) {

                int index = 0;

                while (index < length) {

                    if (sortedNumbers[index] + sortedNumbers[i] == target) {
                        //find the indexes of the first and second number

                        int index1 = Integer.MIN_VALUE;
                        int index2 = Integer.MIN_VALUE;

                        for (int k = 0; k < length; k++) {

                            if (numbers[k] == sortedNumbers[index] || 
                                    numbers[k] == sortedNumbers[i]) {
                                if (index1 == Integer.MIN_VALUE) {
                                    index1 = k;
                                } else {
                                    index2 = k;
                                }
                            }

                        }

                        return new int[]{index1 + 1, index2 + 1};

                    }

                    index++;

                }

            }

        }

        return new int[]{0, 0};

    }
}



