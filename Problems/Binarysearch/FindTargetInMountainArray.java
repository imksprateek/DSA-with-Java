import java.util.ArrayList;

public class FindTargetInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1, 5, 2};
        int target = 2;
        int peak = findPeak(mountainArr);
        int left_search = binarySearch(target, mountainArr, 0, peak);
        int right_search = binarySearch(target, mountainArr, peak, mountainArr.length - 1);
        if (left_search != -1) {
            System.out.println("Item at position: " + left_search);
        } else {
            System.out.println("Item at position: " + right_search);
        }
    }

    public static int findPeak(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) {
                if (mountainArr[mid] > mountainArr[mid - 1]) {
                    return mid;
                }
                end = mid - 1;
            }
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int target, int[] mountainArr, int start, int end) {
        boolean is_order_agnostic = mountainArr[start] < mountainArr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            }
            if (is_order_agnostic) {
                if (mountainArr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (mountainArr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



