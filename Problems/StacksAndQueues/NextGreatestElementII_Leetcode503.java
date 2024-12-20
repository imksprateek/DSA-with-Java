package Problems.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElementII_Leetcode503 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElementsBruteForce(new int[]{1,2,3,4,3})));
    }

    public static int[] nextGreaterElementsBruteForce(int[] nums) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        int[] nge = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            nge[i] = -1;
            for(int j=i+1; j<i+nums.length; j++){
                int index = j%nums.length;

                if(nums[index] > nums[i]){
                    nge[i] = nums[index];
                    break;
                }
            }
        }
        return nge;
    }
}
