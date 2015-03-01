/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author nathanarnold
 */
import pkg2.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Runner = l1;
        ListNode l2Runner = l2;
        int carryOver = 0;
        ListNode answerNode = null;
        ListNode answerNodeRunner = null;

        while (l1Runner != null && l2Runner != null) {

            int currentVal = l1Runner.val + l2Runner.val + carryOver;

            carryOver = 0;

            if (answerNode == null) {
                answerNode = new ListNode(currentVal % 10);
                answerNodeRunner = answerNode;

            } else {

                answerNodeRunner.next = new ListNode(currentVal % 10);
                answerNodeRunner = answerNodeRunner.next;

            }

            if (currentVal >= 10) {
                carryOver = 1;
            }

            l1Runner = l1Runner.next;
            l2Runner = l2Runner.next;

        }

        //continue the run if the other is null
        if (l1Runner != null) {
            while (l1Runner != null) {

                int currentVal = l1Runner.val + carryOver;
                carryOver = 0;

                if (currentVal >= 10) {
                    carryOver = 1;
                }

                answerNodeRunner.next = new ListNode(currentVal % 10);
                answerNodeRunner = answerNodeRunner.next;

                l1Runner = l1Runner.next;
            }
        } else if (l2Runner != null) {
            while (l2Runner != null) {

                int currentVal = l2Runner.val + carryOver;
                carryOver = 0;

                if (currentVal >= 10) {
                    carryOver = 1;
                }

                answerNodeRunner.next = new ListNode(currentVal % 10);
                answerNodeRunner = answerNodeRunner.next;

                l2Runner = l2Runner.next;
            }
        }

        if (carryOver > 0) {
            answerNodeRunner.next = new ListNode(carryOver);
        }

        if (answerNode == null) {
            return null;
        }
        return answerNode;

    }

}
