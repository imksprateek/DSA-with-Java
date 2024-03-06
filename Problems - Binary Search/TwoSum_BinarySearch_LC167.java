import java.util.Arrays;

public class TwoSum_BinarySearch_LC167 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = {-1, -1};
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                break;
            }
            if (sum < target) {
                start++;
            }
            if (sum > target) {
                end--;
            }
        }
        result[0] = start + 1;
        result[1] = end + 1;

        return result;
    }
}
