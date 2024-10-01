package Concepts.Recursion;

import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {3,9,4,7,2,8};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int len, int ele){
        if(len==0){
            return;
        }
        if(ele < len){
            if(arr[ele] > arr[ele+1]){
                int temp = arr[ele+1];
                arr[ele+1] = arr[ele];
                arr[ele] = temp;
            }
            sort(arr,len,ele+1);
        }else{
            sort(arr, len-1, 0);
        }
    }
}
