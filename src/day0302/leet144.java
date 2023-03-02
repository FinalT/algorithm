package day0302;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
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


public class leet144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List res = new ArrayList();
        preorderTraversalReal(root,res);
        return res;
    }

    public void preorderTraversalReal(TreeNode root,List<Integer> res){
        if (root==null){
            return;
        }
        res.add(root.val);
        preorderTraversalReal(root.left,res);
        preorderTraversalReal(root.right,res);

    }
}
