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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("add Two Single Digit Numbers Less than ten \n");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        
           ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        
        Solution instance = new Solution();
        ListNode expResult = new ListNode(7);
        expResult.next = new ListNode(0);
        expResult.next.next = new ListNode(8);
        
        ListNode result = instance.addTwoNumbers(l1, l2);
        ListNode newResult = result;
        
//        System.out.println("add Two Single Digit Numbers Less than ten \n");
//        ListNode l1 = new ListNode(6);
//
//        ListNode l2 = new ListNode(6);
//
//        Solution instance = new Solution();
//        ListNode expResult = new ListNode(2);
//        expResult.next = new ListNode(1);
//
//        ListNode result = instance.addTwoNumbers(l1, l2);
//        ListNode newResult = result;

        while (newResult != null) {
            System.out.println(" ->" + newResult.val);
            newResult = newResult.next;
        }
    }

}
