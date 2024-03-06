public class SingleElementInSortedArray_LC540 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (end == 0) {
            return nums[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] == nums[start + 1]) {
                start += 2;
            } else {
                return nums[start];
            }
            if (nums[end] == nums[end - 1]) {
                end -= 2;
            } else {
                return nums[end];
            }
        }
        return -1;
    }
}
