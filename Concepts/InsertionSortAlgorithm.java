import java.util.Arrays;

public class InsertionSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 8, 9, 7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else if (arr[j] > arr[j - 1]) {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first_index, int second_index) {
        int temp = arr[first_index];
        arr[first_index] = arr[second_index];
        arr[second_index] = temp;
    }
}
