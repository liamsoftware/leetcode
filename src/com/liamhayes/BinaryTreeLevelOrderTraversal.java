package com.liamhayes;

import java.util.ArrayList;
import java.util.List;

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
class BinaryTreeLevelOrderTraversal {

    private List<List<Integer>> levels = new ArrayList<>();
    
    public void helper(BalancedBinaryTree.TreeNode n, int l) {
        
        if (levels.size() == l) levels.add(new ArrayList<>());
        
        levels.get(l).add(n.val);
        
        if (n.left != null) helper(n.left, l + 1);
        if (n.right != null) helper(n.right, l + 1);
    }
    
    
    public List<List<Integer>> levelOrder(BalancedBinaryTree.TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
        
}
