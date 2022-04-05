package com.liamhayes;

public class BalancedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l = new TreeNode(9);
        TreeNode r = new TreeNode(20);
        TreeNode rl = new TreeNode(15);
        TreeNode rr = new TreeNode(7);
        TreeNode rrr = new TreeNode(70);
        TreeNode rrrr = new TreeNode(79);

//        rrr.right = rrrr;
//        rr.right = rrr;
        r.left = rl;
        r.right = rr;
        root.left = l;
        root.right = r;

        System.out.println(isBal(r));
    }

    private static int height(TreeNode n) {
        if (n == null) return -1;
        int result = 1 + Math.max(height(n.left), height(n.right));
        return result;
    }

    public static boolean isBal(TreeNode r) {
        if (r == null) return true;
        return Math.abs(height(r.left) - height(r.right)) < 2
                && isBal(r.left)
                && isBal(r.right);
    }
}
