package meta.easy.LinkedList.OnePointer;

import meta.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        ListNode next = null;
        while (node != null) {
            //save next node for future processing
            next = node.next;
            //set node.next to prev
            node.next = prev;
            //set curr as prev
            prev = node;
            //set next node as curr for next step
            node = next;
        }
        //return prev as it contained last processed node
        return prev;
    }
/*    Time and Space Complexity
    Metric	Value
    Time	O(n)
    Space	O(1)*/
}
