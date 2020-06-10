package ru.rz.leetcode.Trees.IsSymmetric;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (null == root)
            return true;
        return isReflection(root.left, root.right);
    }

    boolean isReflection(TreeNode l, TreeNode r) {
        if (null == l && null == r)
            return true;
        if (null == l || null == r)
            return false;
        if (l.val != r.val)
            return false;
        if (!isReflection(l.left, r.right))
            return false;
        return isReflection(l.right, r.left);
    }
}

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(new Solution().isSymmetric(root)); // true

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(3);

        System.out.println(new Solution().isSymmetric(root1)); // false

        System.out.println(new Solution().isSymmetric(null)); // true
    }
}
