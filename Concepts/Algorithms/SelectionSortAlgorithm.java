package Concepts.Algorithms;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 8, 9, 7};

        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - i - 1;
            int max_index = getMaxIndex(arr, 0, last_index);
            swap(arr, last_index, max_index);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max_index = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max_index]) {
                max_index = i;
            }
        }
        return max_index;
    }

    public static void swap(int[] arr, int first_pos, int second_pos) {
        int temp = arr[first_pos];
        arr[first_pos] = arr[second_pos];
        arr[second_pos] = temp;
    }
}
