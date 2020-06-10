package ru.rz.leetcode.Trees.MinDepthOfBinTree;

/*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    public int minDepth(TreeNode root) {
        if (null == root)
            return 0;
        else if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left != null && root.right != null) {
            int l = minDepth(root.left);
            int r = minDepth(root.right);
            return Math.min(l, r) + 1;
        } else if (root.left != null) {
            return minDepth(root.left) + 1;
        } else {
            return minDepth(root.right) + 1;
        }
    }
}

public class MinDepthOfBinTree {
    public static void main(String[] args) {
        {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);
            System.out.println(new Solution().minDepth(root)); // 2
        }
        {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            System.out.println(new Solution().minDepth(root)); // 2
        }
    }
}
