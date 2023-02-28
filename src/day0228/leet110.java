package day0228;

public class leet110 {

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

    public boolean isBalanced(TreeNode root) {
        return height(root)>=0;
    }

    public int height(TreeNode root){
          if (root==null){
              return 0;
          }

          int leftheight = height(root.left);
          int rightheight = height(root.right);

          if (leftheight==-1||rightheight==-1||Math.abs(leftheight-rightheight)>1){
              return -1;
          }else {
              return Math.max(leftheight,rightheight)+1;
          }
    }
}
