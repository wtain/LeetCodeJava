package ru.rz.leetcode.Trees.MaxDepthOfNaryTree;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

class Solution {
    public int maxDepth(Node root) {
        if (null == root)
            return 0;
        if (null == root.children)
            return 1;
        int mx = 0;
        for (Node n: root.children)
            mx = Math.max(mx, maxDepth(n));
        return mx + 1;
    }
}

public class MaxDepthOfNaryTree {

    public static void main(String[] args) {
        Node root = new Node(1, null);
        ArrayList<Node> children1 = new ArrayList<Node>();
        Node node3 = new Node(3, null);
        children1.add(node3);
        children1.add(new Node(2, null));
        children1.add(new Node(4, null));
        root.children = children1;
        ArrayList<Node> children3 = new ArrayList<Node>();
        children3.add(new Node(5, null));
        children3.add(new Node(6, null));
        node3.children = children3;

        System.out.println(new Solution().maxDepth(root)); // 3
    }
}
