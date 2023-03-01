package sort;

import java.util.Arrays;

public class InsertSort {

    public static int[] sort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i;
            while (j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }

            if (j!=i){
                arr[j]=temp;
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
