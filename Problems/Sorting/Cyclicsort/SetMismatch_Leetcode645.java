package Problems.Sorting.Cyclicsort;

import java.util.Arrays;

public class SetMismatch_Leetcode645 {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println("Result: " + Arrays.toString(findErrorNums(nums)));
    }


        public static int[] findErrorNums(int[] nums) {
            int[] result = new int[2];

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
                if(i != nums[i]-1){
                    result[0] = nums[i];
                    result[1] = i+1;
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
