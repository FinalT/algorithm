package day0228;

public class leet112 {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)return false;
        int temp = targetSum-root.val;


        if (temp==0&&root.left==null&&root.right==null){
            return true;
        }
        return hasPathSum(root.left,temp)||hasPathSum(root.right,temp);
    }
}
