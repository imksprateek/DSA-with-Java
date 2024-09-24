package Concepts.Algorithms.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(high-low == 1)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] result = new int[high - low];

        int left = low;
        int right = mid;
        int i=0;

        while(left < mid && right < high){
            if(arr[left] <= arr[right]) {
                result[i] = arr[left];
                left++;
            }else{
                result[i] = arr[right];
                right++;
            }
            i++;
        }

        while(left < mid){
            result[i] = arr[left];
            left++;
            i++;
        }
        while(right < high){
            result[i] = arr[right];
            right++;
            i++;
        }

        for(int j=0; j<result.length; j++){
            arr[low+j] = result[j];
        }
    }
}