package ru.rz.leetcode.Trees.IsSameTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q)
            return true;
        if (null == p || null == q)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(new Solution().isSameTree(root1, root2)); // true

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);

        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(2);

        System.out.println(new Solution().isSameTree(root3, root4)); // false

        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(1);

        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(1);
        root6.right = new TreeNode(2);

        System.out.println(new Solution().isSameTree(root5, root6)); // false
    }
}
