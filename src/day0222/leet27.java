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

//    优化，使用前后指针
    public static int removeElementA(int[] nums,int val){
        int left = 0;
        int right = nums.length;
        while (left<right){
            if (nums[left]==val){
                nums[left]=nums[right-1];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int a = removeElement(nums, 3);
        int[] numsb = new int[]{3,2,2,3};
        int b = removeElementA(numsb,3);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
