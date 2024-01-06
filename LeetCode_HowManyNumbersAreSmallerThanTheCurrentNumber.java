import java.util.Arrays;

public class LeetCode_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int len = nums.length;
        int[] count = new int[101];
        int[] result = new int[nums.length];
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < 101; i++) {
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
    }
}
