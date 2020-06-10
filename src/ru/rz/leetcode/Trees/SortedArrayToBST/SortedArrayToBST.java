package ru.rz.leetcode.Trees.SortedArrayToBST;


 /*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {

    TreeNode buildTreeImpl(int[] nums, int i1, int i2) {
        if (i1 >= i2)
            return null;
        int m = i1 + (i2-i1)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = buildTreeImpl(nums, i1, m);
        root.right = buildTreeImpl(nums, m+1, i2);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTreeImpl(nums, 0, nums.length);
    }
}

public class SortedArrayToBST {

    static void printTree(TreeNode root) {
        if (null == root) {
            System.out.print("NIL");
            return;
        }
        System.out.print(root.val);
        System.out.print('(');
        printTree(root.left);
        System.out.print(',');
        printTree(root.right);
        System.out.print(')');
    }

    public static void main(String[] args) {
        printTree(new Solution().sortedArrayToBST(new int[] {-10,-3,0,5,9}));
        System.out.println();
    }
}
