package ru.rz.leetcode.Lists.DeleteNode;

/*public */class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public void deleteNode(ListNode node) {
        ListNode next = node;
        ListNode prev = null;
        while (next != null) {
            node.val = next.val;
            prev = node;
            node = next;
            next = next.next;
        }
        if (null != prev)
            prev.next = null;
    }
}

public class DeleteNode {

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(String.format("%d ", head.val));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        {
            ListNode head = new ListNode(4);
            head.next = new ListNode(5);
            head.next.next = new ListNode(1);
            head.next.next.next = new ListNode(9);
            new Solution().deleteNode(head.next);
            printList(head); // 4 1 9
        }
        {
            ListNode head = new ListNode(4);
            head.next = new ListNode(5);
            head.next.next = new ListNode(1);
            head.next.next.next = new ListNode(9);
            new Solution().deleteNode(head.next.next);
            printList(head); // 4 5 9
        }
    }
}
