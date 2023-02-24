package day0224;

import java.util.Arrays;

public class leet88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void mergeB(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        int tail = m+n-1;
        int cur;
        while (p>=0||q>=0){
            if (p==-1){
                cur=nums2[q--];
            }else if (q==-1){
                cur=nums1[p--];
            }else if (nums1[p]>=nums2[q]){
                cur=nums1[p--];
            }else {
                cur=nums2[q--];
            }
            nums1[tail--]=cur;
        }
    }


}
