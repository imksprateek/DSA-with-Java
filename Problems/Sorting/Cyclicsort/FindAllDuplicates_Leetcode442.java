package Problems.Sorting.Cyclicsort;

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicates_Leetcode442 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println("The duplicate numbers are: " + findDuplicates(nums));;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList();

        int pointer = 0;
        while(pointer < nums.length){
            int correct_index = nums[pointer] - 1;
            if(nums[pointer] != nums[correct_index]){
                swap(pointer, correct_index, nums);
            }else{
                pointer++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    }

    public static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}