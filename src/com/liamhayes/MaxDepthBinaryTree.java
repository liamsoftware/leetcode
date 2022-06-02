package com.liamhayes;

public class MaxDepthBinaryTree {

    private int result = 0;

    public void helper(TreeNode n, int depth) {
        if (n != null) {
            if (n.left == null && n.right == null)
                result = Math.max(result, depth);

            if (n.left != null) helper(n.left, depth + 1);
            if (n.right != null) helper(n.right, depth + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root != null) helper(root, 1);
        return result;
    }
}
