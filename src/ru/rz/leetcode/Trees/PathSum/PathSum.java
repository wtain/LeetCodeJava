package ru.rz.leetcode.Trees.PathSum;

/*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root)
            return false;
        if (root.left == null && root.right == null)
            return root.val == sum;
        return hasPathSum(root.left, sum-root.val) ||
               hasPathSum(root.right, sum-root.val);
    }
}

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(new Solution().hasPathSum(root, 22)); // true
    }
}
