package ru.rz.leetcode.Trees.SumOfLeftLeaves;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesImpl(root, false);
    }

    int sumOfLeftLeavesImpl(TreeNode root, boolean isLeft) {
        if (null == root)
            return 0;
        int result = 0;
        if (isLeft && root.right == null && root.left == null)
            result += root.val;
        result += sumOfLeftLeavesImpl(root.left, true);
        result += sumOfLeftLeavesImpl(root.right, false);
        return result;
    }
}

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new Solution().sumOfLeftLeaves(root)); // 24
    }
}
