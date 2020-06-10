package ru.rz.leetcode.Trees.BinTreeLevelOrderTraversal2;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii

import java.util.ArrayList;
import java.util.List;

/*public */class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int depth = maxDepth(root);
        for (int i = 0; i < depth; ++i) {
            result.add(new ArrayList<Integer>());
        }
        levelOrderBottom(root, result, depth, 0);

        List<List<Integer>> result1 = new ArrayList<List<Integer>>();
        for (ArrayList<Integer> al: result) {
            result1.add(al);
        }

        return result1;
    }

    int maxDepth(TreeNode root) {
        if (null == root)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    void levelOrderBottom(TreeNode root, ArrayList<ArrayList<Integer>> result, int maxDepth, int currentDepth) {
        if (null == root)
            return;
        int levelIndex=maxDepth-currentDepth-1;
        ArrayList<Integer> level = result.get(levelIndex);
        if (null == level) {
            level = new ArrayList<>();
            result.set(levelIndex, level);
        }
        level.add(root.val);
        levelOrderBottom(root.left, result, maxDepth, currentDepth+1);
        levelOrderBottom(root.right, result, maxDepth, currentDepth+1);
    }
}

public class BinTreeLevelOrderTraversal2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        //System.out.println();

        List<List<Integer>> result = new Solution().levelOrderBottom(root);

        for (List<Integer> level: result)
        {
            for (Integer v: level)
                System.out.print(String.format("%d ", v));
            System.out.println();
        }

        /*
        [
  [15,7],
  [9,20],
  [3]
]
        * */
    }
}
