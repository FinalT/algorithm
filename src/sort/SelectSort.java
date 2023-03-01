package sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }

            if (i!=min){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] test1 = new int[]{5,4,6,5,1,3};
        sort(test1);
        System.out.println(Arrays.toString(test1));
    }
}
