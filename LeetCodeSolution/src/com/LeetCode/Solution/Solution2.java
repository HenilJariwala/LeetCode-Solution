//2. Add two Number
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
// 
//
//Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]


//Solution (Time Complexity O(n^4)
//public class Solution2 {
//	
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans = new ListNode(0);
//        ListNode temp = ans;
//        int carry = 0;
//        while(l1!=null || l2!= null || carry!=0){
//            int sum = carry;
//            if(l1 != null){
//                sum += l1.val;
//                l1 = l1.next;
//            }
//
//            if(l2 != null){
//                sum += l2.val;
//                l2 = l2.next;
//            }
//
//            carry = sum/10;
//
//            temp.next = new ListNode(sum%10);
//            temp = temp.next;
//        }
//        return ans.next;
//    }
//    
//	public static void main(String[] args) {
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465
//
//        Solution2 ob1 = new Solution2();
//        ListNode result = ob1.addTwoNumbers(l1, l2); // Expected: 7 -> 0 -> 8
//
//        printList(result);
//    }
//
//    public static void printList(ListNode node) {
//        while (node != null) {
//            System.out.print(node.val);
//            if (node.next != null) System.out.print(" -> ");
//            node = node.next;
//        }
//        System.out.println();
//    }
//}

package com.LeetCode.Solution;
