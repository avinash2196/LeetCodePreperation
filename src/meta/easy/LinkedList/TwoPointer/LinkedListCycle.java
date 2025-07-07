package meta.easy.LinkedList.TwoPointer;

import meta.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //use two pointer , they will meet if cycle exists
        if (head == null || head.next == null) return false;
        //use fast=head.next otherwise fast.next.next might get null pointer in case of 1 node
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    // Time complexity :O(n)
// Space Complexity :O(1)
}
