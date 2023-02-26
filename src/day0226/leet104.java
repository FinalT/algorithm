package day0226;


public class leet104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int lefthigh = maxDepth(root.left);
        int righthigh = maxDepth(root.right);

        return Math.max(lefthigh,righthigh)+1;
    }
}
