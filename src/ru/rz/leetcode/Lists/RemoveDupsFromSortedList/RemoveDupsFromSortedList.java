package ru.rz.leetcode.Lists.RemoveDupsFromSortedList;

 /*public */class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head)
            return null;
        ListNode curr = head.next;
        ListNode prev = head;
        while (null != curr) {
            if (curr.val == prev.val) {
                prev.next = null;
            } else {
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}

public class RemoveDupsFromSortedList {

    public static void printList(ListNode list) {
        while (null != list)
        {
            System.out.print(String.format("%d ", list.val));
            list = list.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);

        printList(new Solution().deleteDuplicates(list1)); // 1 2

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(3);
        list2.next.next.next.next = new ListNode(3);

        printList(new Solution().deleteDuplicates(list2)); // 1 2 3
    }
}
