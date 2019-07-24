package hash;

/**
 * 206. Reverse Linked List
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively.
 * Could you implement both?
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode resultTemp = result;
        while (head.next != null) {
            ListNode tempNode = null;
            ListNode temp = head;
            while (temp.next != null) {
                tempNode = temp;
                temp = temp.next;
            }
            result.val = temp.val;
            result.next = new ListNode(0);
            result = result.next;
            if (tempNode != null)
                tempNode.next = null;
        }

        return resultTemp;
    }
}
