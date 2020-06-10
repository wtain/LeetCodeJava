package ru.rz.leetcode.Lists.RemoveLinkedListElements;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode leadingHead = new ListNode(0);
        leadingHead.next = head;

        ListNode current = head, prev = leadingHead;
        while (null != current) {
            if (current.val == val)
                prev.next = current.next;
            else
                prev = current;
            current = current.next;
        }

        return leadingHead.next;
    }
}

public class RemoveLinkedListElements {

    static void printList(ListNode head) {
        ListNode c = head;
        while (null != c) {
            System.out.print(String.format("%d ", c.val));
            c = c.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /*Input:  1->2->6->3->4->5->6, val = 6
        Output: 1->2->3->4->5*/
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);
        printList(new Solution().removeElements(head1, 6));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        printList(new Solution().removeElements(head2, 1));
    }
}
