public class PosOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 7, 9, 12, 34, 45, 48, 49, 52, 55, 59, 64, 73, 77, 83, 89, 91, 95, 98, 103, 108, 111, 116, 119, 153, 167, 184, 192, 199, 261};
        int target = 192;
        int position = FindRange(nums, target);
        if (position == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at position " + position);
        }
    }

    public static int FindRange(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        System.out.println(start);
        System.out.println(end);
        return BinarySearch(nums, target, start, end);
    }

    public static int BinarySearch(int[] nums, int target, int start, int end) {
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
