package Concepts.Recursion;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        //This code for Binary Search has Divide & Conquer recurrence relation
        int[] arr = {1,2,3,4,5,6,7,8,9,10, 11};
        System.out.println("Key found at index: " + binarySearchRecursive(arr, 6, 0, arr.length - 1));

    }

    static int binarySearchRecursive(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearchRecursive(arr, target, mid+1, end);
        }
        return binarySearchRecursive(arr, target, start, mid-1);
    }
}
