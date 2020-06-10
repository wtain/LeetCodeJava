package ru.rz.leetcode.Lists.MergeTwoSortedLists;

/*public */class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {

    ListNode append(ListNode t, ListNode s) {
        if (null != t)
            t.next = s;
        return s;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev = append(prev, l1);
                l1 = l1.next;
            } else {
                prev = append(prev, l2);
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            prev = append(prev, l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            prev = append(prev, l2);
            l2 = l2.next;
        }
        return result.next;
    }
}

public class MergeTwoSortedLists {

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(String.format("%d ", head.val));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = new Solution().mergeTwoLists(list1, list2);
        printList(result); // 1 1 2 3 4 4
    }
}
