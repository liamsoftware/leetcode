package com.liamhayes;

import java.util.Queue;
import java.util.LinkedList;

public class InvertBinaryTree {
    
     /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

//    public TreeNode invertTree(TreeNode root) {
//
//        if (root == null) return root;
//
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            TreeNode curr = q.poll();
//            TreeNode t = curr.left;
//            curr.left = curr.right;
//            curr.right = t;
//            if (curr.right != null) q.add(curr.right);
//            if (curr.left != null) q.add(curr.left);
//        }
//        return root;
//    }
}
    
