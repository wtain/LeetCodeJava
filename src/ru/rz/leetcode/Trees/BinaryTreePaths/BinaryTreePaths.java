package ru.rz.leetcode.Trees.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    void binaryTreePathsImpl(TreeNode root, List<String> paths, String prefix) {
        if (null == root)
            return;
        String current = prefix;
        if (!current.isEmpty())
            current += "->";
        current += root.val;
        if (null == root.left && null == root.right) {
            paths.add(current);
        } else {
            binaryTreePathsImpl(root.left, paths, current);
            binaryTreePathsImpl(root.right, paths, current);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePathsImpl(root, paths, "");
        return paths;
    }
}

public class BinaryTreePaths {

    static void printList(List<String> paths) {
        for (String p: paths)
            System.out.println(p);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        printList(new Solution().binaryTreePaths(root)); // "1->2->5", "1->3"
    }
}
