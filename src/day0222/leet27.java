package day0222;

public class leet27 {

    public static int removeElement(int[] nums, int val) {
        int p=0;
        int q=0;
        while (q<nums.length){
            if (nums[q]==val) {
                q++;
            }else {
                nums[p] = nums[q];
                p++;
                q++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int i = removeElement(nums, 3);
        System.out.println(i);
    }
}
