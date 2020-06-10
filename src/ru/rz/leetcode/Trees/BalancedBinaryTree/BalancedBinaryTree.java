package ru.rz.leetcode.Trees.BalancedBinaryTree;

/*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/*class Solution {

    class Depth
    {
        int minDepth, maxDepth;

        Depth() {
            minDepth = Integer.MAX_VALUE;
            maxDepth = Integer.MIN_VALUE;
        }

        boolean isBalanced() {
            return maxDepth - minDepth <= 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (null == root)
            return true;
        Depth d = new Depth();
        minMaxDepth(root, d, 0);
        return d.isBalanced();
    }

    void minMaxDepth(TreeNode root, Depth d, int currDepth) {
        if (root.right == null && root.left == null) {
            d.minDepth = Math.min(d.minDepth, currDepth);
            d.maxDepth = Math.max(d.maxDepth, currDepth);
        } else {
            if (root.left != null)
                minMaxDepth(root.left, d, currDepth+1);
            if (root.right != null)
                minMaxDepth(root.right, d, currDepth+1);
        }
    }
}*/

class Solution {

    class Depth {
        Integer depth;
    }

    boolean isBalancedImpl(TreeNode root, Depth depth) {
        if (null == root) {
            depth.depth = 0;
            return true;
        } else {
            Depth lDepth = new Depth();
            if (!isBalancedImpl(root.left, lDepth))
                return false;
            Depth rDepth = new Depth();
            if (!isBalancedImpl(root.right, rDepth))
                return false;
            depth.depth = Math.max(lDepth.depth, rDepth.depth) + 1;
            return Math.max(lDepth.depth, rDepth.depth) - Math.min(lDepth.depth, rDepth.depth) <= 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return isBalancedImpl(root, new Depth());
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {
        {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);
            System.out.println(new Solution().isBalanced(root)); // true
        }

        {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(2);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(3);
            root.left.left.left = new TreeNode(4);
            root.left.left.right = new TreeNode(4);
            System.out.println(new Solution().isBalanced(root)); // false
        }

        {
            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2);
            root.right.right = new TreeNode(3);
            System.out.println(new Solution().isBalanced(root)); // false
        }
    }
}
