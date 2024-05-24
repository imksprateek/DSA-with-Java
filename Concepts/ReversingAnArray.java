package Concepts;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 54, 63, 79, 53, 12, 98, 234};
        Swap(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int[] array) {
        int start = 0;
        int end = array.length - 1;
        for (int i = start; i <= end; i++) {
            if (start > end) {
                break;
            }
            swap(array, start, end);
            start++;
            end--;

        }
    }

    public static void swap(int[] array, int startpoint, int endpoint) {
        int temp = array[startpoint];
        array[startpoint] = array[endpoint];
        array[endpoint] = temp;
    }
}
