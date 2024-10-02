package Concepts.Algorithms.Sorting.QuickSort;

import java.util.Arrays;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 8, 9, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //high and low in parameters are for what part of the array we are working on
    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        //start and end are for swapping
        int start = low;
        int end = high;

        //Take the middle element as pivot
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}
