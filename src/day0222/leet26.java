package day0222;

public class leet26 {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int p = 0;
        int q = 1;
        while (q<nums.length){
            if (nums[p]!=nums[q]){
                if (q-p>1){
                    nums[p+1]=nums[q];
                }
                p++;
            }
            q++;
        }
        return p+1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(ints);
        System.out.println(i);
    }
}
