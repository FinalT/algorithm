package day0224;

public class leet101 {

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

    public boolean isSymmetric(TreeNode root) {
        return isSameTrue(root.left,root.right);
    }

    public boolean isSameTrue(TreeNode p,TreeNode q){
        return p==null?q==null:q!=null&&
                (p.val==q.val)&&
                isSameTrue(p.left,q.right)&&
                isSameTrue(p.right,q.left);
    }
}
