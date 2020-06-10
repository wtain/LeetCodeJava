package ru.rz.leetcode.Lists.LinkedListCycle;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (null == head)
            return false;
        slow = slow.next;
        fast = slow;
        if (null == fast)
            return false;
        fast = fast.next;
        while (fast != null && slow != fast) {
            slow = slow.next;
            fast = fast.next;
            if (null == fast)
                return false;
            fast = fast.next;
        }
        return null != fast;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        {
            ListNode head = new ListNode(3);
            head.next = new ListNode(2);
            head.next.next = new ListNode(0);
            head.next.next.next = new ListNode(-4);
            head.next.next.next.next = head.next;
            System.out.println(new Solution().hasCycle(head)); // true
        }
        {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = head;
            System.out.println(new Solution().hasCycle(head)); // true
        }
        {
            ListNode head = new ListNode(1);
            System.out.println(new Solution().hasCycle(head)); // false
        }
    }
}
