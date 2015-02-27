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

        if (l1 == null && l1 == null) {
            return null;
        }

        ListNode answerNode;
        
        if (l1.next != null && l2.next != null) {
            
            answerNode = addTwoNumbers(l1.next, l2.next);

        }

        if (answerNode != null && answerNode.val > 9) {

            if (l1 == null) {

                l1 = new ListNode(answerNode.val - 9);

            } else {

                l1.val = answerNode.val - 9;
            }

        }

        int answer;

        if (l1 != null && l2 != null) {

            answer = l1.val + l2.val;

        } else if (l1 != null) {

            answer = l1.val;
//            ListNode ans = new ListNode(l1.val);
//            
//            answerNode.next = ans;

//            return ans;
        } else {
            answer = l2.val;

//            ListNode ans = new ListNode(l2.val);
        }

        ListNode currentAnswer;

        if (answerNode == null && answer > 9) {

            currentAnswer = new ListNode(answer - 10);
            currentAnswer.next = new ListNode(1);
        } else {
            currentAnswer = new ListNode(answer);
            currentAnswer.next = answerNode;

        }

        return currentAnswer;

    }
}
