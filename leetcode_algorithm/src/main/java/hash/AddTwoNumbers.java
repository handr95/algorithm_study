package hash;

/**
 * 2. Add Two Numbers (https://leetcode.com/problems/add-two-numbers/)
 * Medium
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode listNode1 = l1, listNode2 = l2, dummyListNode = resultListNode;
        int carry = 0;

        while (listNode1 != null || listNode2 != null) {
            int x = listNode1 != null ? listNode1.val : 0;
            int y = listNode2 != null ? listNode2.val : 0;

            int sum = x + y + carry;

            dummyListNode.next = new ListNode(sum % 10);
            carry = sum / 10;

            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }

        return resultListNode;
    }
}
