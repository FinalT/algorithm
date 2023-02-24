package day0224;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leet94 {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List ans = new ArrayList();
        inorderTraversal(root,ans);
        return ans;
    }

    public void inorderTraversal(TreeNode root,List list){
        if (root==null){
            return;
        }
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }

    public List<Integer> inorderTraversalB(TreeNode root){
        List ans = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            ans.add(root.val);
            root=root.right;
        }
        return ans;
    }
}
