package ru.rz.leetcode.Lists.IntersectionOfTwoLinkedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {

    int length(ListNode head) {
        int l = 0;
        while (null != head) {
            head = head.next;
            ++l;
        }
        return l;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        if (l1 > l2) {
            int n = l1 - l2;
            for (int i = 0; i < n; ++i)
                headA = headA.next;
        } else if (l2 > l1) {
            int n = l2 - l1;
            for (int i = 0; i < n; ++i)
                headB = headB.next;
        }
        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        {
            ListNode l1 = new ListNode(4);
            l1.next = new ListNode(1);
            l1.next.next = new ListNode(8);
            l1.next.next.next = new ListNode(4);
            l1.next.next.next.next = new ListNode(5);
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(0);
            l2.next.next = new ListNode(1);
            l2.next.next.next = l1.next.next;
            System.out.println(new Solution().getIntersectionNode(l1, l2).val); // 8
        }
    }
}
