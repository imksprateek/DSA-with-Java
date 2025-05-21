package Problems.Array;

import java.util.Arrays;

public class WiggleSortII_Leetcode324 {
    public static void main(String[] args) {
        int[] nums = {1,5,1,1,6,4};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void wiggleSort(int[] nums) {

        int[] copy = Arrays.copyOf(nums,nums.length);

        Arrays.sort(copy);

        int middle = (nums.length-1)/2;
        int end = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = copy[middle--];
            }else{
                nums[i] = copy[end--];
            }
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
