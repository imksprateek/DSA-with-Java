//Finding Peak Index in a Mountain array using Binary Search - O(log n)
public class FindPeakElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 12, 6, 3};
        int peak_index = peakIndexInMountainArray(arr);
        System.out.println("peak index: " + peak_index);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                }
                end = mid - 1;
            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
