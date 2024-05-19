public class FindTargetInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 9, 2, 2, 2};
        int target = 2;
        int peak_index = FindPeak(nums);
        System.out.println("Peak: " + peak_index);
        if (peak_index == -1) {
            System.out.println(BinarySearch(nums, target, 0, nums.length - 1));
        }

        if (target == nums[peak_index]) {
            System.out.println(peak_index);
        }
        if (target >= nums[0]) {
            System.out.println(BinarySearch(nums, target, 0, peak_index - 1));
        }

        System.out.println(BinarySearch(nums, target, peak_index + 1, nums.length - 1));

    }

    static int FindPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
//            if (nums[mid] <= nums[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end - 1] > nums[end]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int BinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}