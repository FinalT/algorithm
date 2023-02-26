package day0226;

public class leet108 {



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

    public TreeNode sortedArrayToBST(int[] nums) {

        return TreeHelper(nums,0,nums.length-1);


    }

    private TreeNode TreeHelper(int[] nums, int left, int right) {
        if (left>right){
            return null;
        }

        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = TreeHelper(nums,left,mid-1);
        root.right = TreeHelper(nums,mid+1,right);
        return root;
    }
}
