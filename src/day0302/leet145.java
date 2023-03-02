package day0302;

import java.util.ArrayList;
import java.util.List;

public class leet145 {



    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversalReal(root,res);
        return res;
    }

    public void postorderTraversalReal(TreeNode root,List res){
        if (root==null)return;
        postorderTraversalReal(root.left,res);
        postorderTraversalReal(root.right,res);
        res.add(root.val);
    }
}
