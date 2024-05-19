import java.util.Arrays;

public class SmallerNumbersThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(nums);
        ;
    }

    static void smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] count = new int[101];
        int[] result = new int[nums.length];
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }
        System.out.println(Arrays.toString(result));
//        return result;
    }
}
