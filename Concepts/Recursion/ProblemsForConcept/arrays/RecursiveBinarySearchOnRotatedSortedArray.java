package Concepts.Recursion.ProblemsForConcept.arrays;

public class RecursiveBinarySearchOnRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,11,1,3};
//        int[] arr = {6,1,2,3,4,5};
        System.out.println("Found at index " + search(arr,11, 0, arr.length-1));
    }

    public static int search(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {

            if (key >= arr[low] && key <= arr[mid]) {
                return search(arr, key, low, mid - 1);
            } else {
                return search(arr, key, mid + 1, high);
            }
        }
        else {
            if (key >= arr[mid + 1] && key <= arr[high]) {
                return search(arr, key, mid + 1, high);
            } else {
                return search(arr, key, low, mid - 1);
            }
        }
    }

}
