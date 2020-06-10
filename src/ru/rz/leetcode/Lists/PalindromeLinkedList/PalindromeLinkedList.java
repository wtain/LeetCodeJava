package ru.rz.leetcode.Lists.PalindromeLinkedList;

/*public */class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 1 -> 2 -> 3
// 1 2
// 2 nil

/*
* 1 -> 2
* 1 2
* 2 nil
*
* 1 -> 2 -> 3 -> 4
*
* 1 2
* 2 4
* 3 nil
* */

class Solution {

    ListNode getMiddle(ListNode head) {
        if (null == head)
            return null;
        ListNode end = head;
        end = head.next;
        while (end != null) {
            head = head.next;
            end = end.next;
            if (null == end)
                return head;
            end = end.next;
        }
        return head;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (null != head) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode head2 = reverse(middle);

        while (head != null && head2 != null) {
            if (head.val != head2.val)
                return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        System.out.println(new Solution().isPalindrome(list1)); // false

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(1);
        System.out.println(new Solution().isPalindrome(list2)); // true

        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(2);
        list3.next.next = new ListNode(3);
        list3.next.next.next = new ListNode(2);
        list3.next.next.next.next = new ListNode(1);
        System.out.println(new Solution().isPalindrome(list3)); // true

        System.out.println(new Solution().isPalindrome(new ListNode(1))); // true

        System.out.println(new Solution().isPalindrome(null)); // true
    }
}
