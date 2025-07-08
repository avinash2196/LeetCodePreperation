package meta.easy.LinkedList.OnePointer;

import meta.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        //find next element after first half and reverse list after that
        ListNode node = head;
        if (node == null) {
            return true;
        }
        ListNode firstHalfEnd = endOfFirstHalf(node);
        ListNode reverseListStart = reverseList(firstHalfEnd.next);

        //verify if palindrome
        boolean palindromeFlag = true;
        ListNode node1 = head;
        ListNode node2 = reverseListStart;
        while (palindromeFlag && node2 != null) {
            if (node1.val != node2.val) {
                palindromeFlag = false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        firstHalfEnd.next = reverseList(reverseListStart);
        return palindromeFlag;
    }

    ListNode endOfFirstHalf(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode node) {
        ListNode next = null, prev = null, curr = node;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    /*
    COMPLEXITY ANALYSIS
    Aspect	Value
    Time	O(n)
    Space	O(1)*/
}
