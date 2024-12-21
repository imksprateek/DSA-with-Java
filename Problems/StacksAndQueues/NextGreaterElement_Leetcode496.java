package Problems.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_Leetcode496 {
    public static void main(String[] args) {
        //A monotonic stack is a stack that preserves order, it may be increasing or decreasing.

        System.out.println(Arrays.toString(nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2})));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];
        Stack<Integer> stack = new Stack();
        stack.push(-1);

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    ans[i] = nge[j];
                    break;
                }
            }
        }

        return ans;
    }
}
