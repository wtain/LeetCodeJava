package ru.rz.leetcode.Trees.InvertBinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        List<TreeNode> nextLevel = new ArrayList<>();
        if (null != root)
            nextLevel.add(root);

        while (!nextLevel.isEmpty()) {
            List<TreeNode> currLevel = nextLevel;
            nextLevel = new ArrayList<>();
            for (TreeNode t: currLevel) {
                TreeNode tmp = t.left;
                t.left = t.right;
                t.right = tmp;

                if (null != t.left)
                    nextLevel.add(t.left);
                if (null != t.right)
                    nextLevel.add(t.right);
            }
        }
        return root;
    }
}

public class InvertBinaryTree {

    static void printTree(TreeNode root) {
        List<TreeNode> nextLevel = new ArrayList<>();
        if (null != root)
            nextLevel.add(root);

        while (!nextLevel.isEmpty()) {
            List<TreeNode> currLevel = nextLevel;
            nextLevel = new ArrayList<>();
            for (TreeNode t: currLevel) {
                System.out.print(String.format("%d ", t.val));
                if (null != t.left)
                    nextLevel.add(t.left);
                if (null != t.right)
                    nextLevel.add(t.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        printTree(new Solution().invertTree(root));
    }
}
