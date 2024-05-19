package Problems.Sorting;

public class MissingNumber_Leetcode268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number is: " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int upper_bound = nums.length;
        int pointer = 0;

        while(pointer < upper_bound){
            int correct_index = nums[pointer];
            if(pointer != correct_index && nums[pointer] < upper_bound){
                swap(pointer, correct_index, nums);
            }else{
                pointer++;
            }
        }

        for(int i=0; i<upper_bound;i++){
            if(nums[i] != i){
                return i;
            }
        }

        return nums[upper_bound-1] + 1;
    }

    public static void swap(int start, int end, int[] arr){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
