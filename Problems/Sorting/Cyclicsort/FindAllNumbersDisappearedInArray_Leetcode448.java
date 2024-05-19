package Problems.Sorting.Cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInArray_Leetcode448 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("Missing numbers are: " + findDisappearedNumbers(nums).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList();

        int pointer = 0;
        while(pointer < nums.length){
            int correct_index = nums[pointer]-1;
            if(nums[pointer] != nums[correct_index]){
                swap(pointer, correct_index, nums);
            }else{
                pointer++;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(nums));

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                result.add(i+1);
            }
        }

        return result;
    }

    public static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
