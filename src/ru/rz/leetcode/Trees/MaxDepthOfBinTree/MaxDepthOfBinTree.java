package ru.rz.leetcode.Trees.MaxDepthOfBinTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    public int maxDepth(TreeNode root) {
        if (null == root)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

public class MaxDepthOfBinTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().maxDepth(root)); // 3
    }
}
