package day0227;

public class leet11 {
//盛放最多水的容器

    //利用双指针
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int res =0;
        while (l<r){
            int area = Math.min(height[l],height[r])*(r-l);
            if (height[l] < height[r]) {
                ++l;
            }else {
                --r;
            }
            res = Math.max(area,res);
        }
        return res;
    }
}
