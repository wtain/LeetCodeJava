package ru.rz.leetcode.Trees.LowestCommonAnsestorInBST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/*class Solution {

    boolean getPathImpl(TreeNode root, TreeNode p, List<TreeNode> result) {
        if (null == root)
            return false;
        if (root == p) {
            result.add(root);
            return true;
        }
        if (getPathImpl(root.left, p, result)) {
            result.add(root);
            return true;
        }
        if (getPathImpl(root.right, p, result)) {
            result.add(root);
            return true;
        }
        return false;
    }

    List<TreeNode> getPath(TreeNode root, TreeNode p) {
        List<TreeNode> result = new LinkedList<>();
        getPathImpl(root, p, result);
        return result;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = getPath(root, p);
        List<TreeNode> path2 = getPath(root, q);
        Iterator<TreeNode> it1 = path1.iterator();
        Iterator<TreeNode> it2 = path2.iterator();

        int n1 = path1.size();
        int n2 = path2.size();
        if (n1 > n2) {
            int m = n1 - n2;
            for (int i = 0; i < m; ++i)
                it1.next();
        } else if (n2 > n1) {
            int m = n2 - n1;
            for (int i = 0; i < m; ++i)
                it2.next();
        }

        while (it1.hasNext() && it2.hasNext()) {
            TreeNode node1 = it1.next();
            TreeNode node2 = it2.next();
            if (node1 == node2)
                return node1;
        }
        return root;
    }
}*/

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int v1 = p.val;
        int v2 = q.val;
        while (root.val != v1 && root.val != v2) {
            if (root.val > v1 && root.val > v2)
                root = root.left;
            else if (root.val < v1 && root.val < v2)
                root = root.right;
            else
                break;
        }
        return root;
    }
}

public class LowestCommonAnsestorInBST {
    public static void main(String[] args) {
        {
            TreeNode root = new TreeNode(6);
            root.left = new TreeNode(2);
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(4);
            root.left.right.left = new TreeNode(3);
            root.left.right.right = new TreeNode(5);
            root.right = new TreeNode(8);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(9);
            System.out.println(new Solution().lowestCommonAncestor(root, root.left, root.right).val); // 6

            System.out.println(new Solution().lowestCommonAncestor(root, root.left, root.left.right).val); // 2
        }
    }
}
