package day0228;

public class leet111 {

    public class TreeNode {
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

    public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null&& root.right==null){
            return 1;
        }
        int leftmin = minDepth(root.left);
        int rightmin = minDepth(root.right);
        if (root.left==null||root.right==null){
            return leftmin+rightmin+1;
        }
        return Math.min(leftmin,rightmin)+1;
    }
}
