public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        boolean found = false;
        int[] result = new int[2];

        int start_loc = findStart(nums, target);
        int end_loc = findEnd(nums, target);

        result[0] = start_loc;
        result[1] = end_loc;

        return result;
    }

    public int findStart(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                found = true;
            }

            if (target > nums[mid]) {
                if (target == nums[start]) {
                    break;
                }
                start = mid + 1;
            }

            if (target <= nums[mid]) {
                end = mid - 1;
            }

        }
        if (found == false) {
            return -1;
        }
        return start;
    }

    public int findEnd(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                found = true;
            }

            if (target >= nums[mid]) {
                start = mid + 1;
            }

            if (target < nums[mid]) {
                if (target == nums[end]) {
                    break;
                }
                end = mid - 1;
            }

        }
        if (found == false) {
            return -1;
        }
        return end;
    }
}
