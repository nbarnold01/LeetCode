/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nathanarnold
 */
public class Solution {

    public int removeDuplicates(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        int length = A.length;
        int fastRunner = 0;
        int slowRunner = -1;

        while (fastRunner < length) {

            if (slowRunner == -1 || A[slowRunner] != A[fastRunner]) {

                slowRunner++;

                A[slowRunner] = A[fastRunner];

            }

            fastRunner++;
        }

        return slowRunner + 1;

    }
}
