public class FindNumberOfRotationsInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        System.out.println(findKRotation(arr));
    }

    static int findKRotation(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
