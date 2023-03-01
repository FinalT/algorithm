package sort;

import java.util.Arrays;


//冒泡排序
public class ButtleSort {

    public static int[] sort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    flag=false;
                }
            }
            if (flag){
                break;
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
