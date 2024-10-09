package Problems.Array;

import java.util.Arrays;

public class CanMakeAPsequence_Leetcode1502 {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[] {3,5,1}));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        int diff = arr[1] - arr[0];

        if(arr.length > 2){
            for(int i=2; i<arr.length;i++){
                if(arr[i] - arr[i-1] != diff){
                    return false;
                }
            }
        }

        return true;
    }
}
