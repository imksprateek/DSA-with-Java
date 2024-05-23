package Problems.Sorting.Cyclicsort;

import java.util.Arrays;

public class FirstMissingPositive_Leetcode41 {

    public static void main(String[] args) {
//        int[] arr = {-10,-3,-100,-1000,-239,1};
//        int[] arr = {-1,-2,-60,40,43};
        int[] arr = {3,4,-1,1};
        System.out.println("First missing positive integer: " + cyclicSort(arr));
    }

    public static int cyclicSort(int[] nums){
        int pointer = 0;

        while(pointer < nums.length){
            int correct = nums[pointer] -1;

            if(nums[pointer] > 0 && nums[pointer] <= nums.length && nums[pointer] != nums[correct]){
                swap(pointer, correct, nums);
            }else{
                pointer++;
            }
        }

        for(int i=0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }

        return nums.length + 1;
    }


    public static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
