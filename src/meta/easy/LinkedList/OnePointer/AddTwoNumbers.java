package meta.easy.LinkedList.OnePointer;

import meta.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;
        while (carry == 1 || l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + carry;
            node.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            node = node.next;
        }
        return head.next;
    }
	   /*    Time and Space Complexity
    Metric	Value
    Time	O(max(m,n)
    Space	O(max(m,n)
	*/
}
