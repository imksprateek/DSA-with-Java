package Concepts.Recursion;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,8,7,2,6,1};
        sort(arr, arr.length-1, 0 ,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int len, int cur, int max){
        if(len == 0){
            return;
        }
        if(cur == len){
            int temp = arr[max];
            arr[max] = arr[len];
            arr[len] = temp;
            sort(arr,len-1,0,0);
        }
        if(cur < len){
            if(arr[cur] > arr[max]){
                sort(arr, len, cur+1, cur);
            }else{
                sort(arr,len,cur+1,max);
            }
        }
    }
}
