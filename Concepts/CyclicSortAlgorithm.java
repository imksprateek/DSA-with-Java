public class CyclicSortAlgorithm {
    public static void main(String[] args) {
        //Use Cyclic sort when there are 1 to n elements (The upper bound n is given) or when there are continuous elements
//        int[] arr = {3, 5, 1, 4, 2};
        int[] arr = {5, 4, 3, 2, 1};

        cyclicSort(arr);

        System.out.println("Result after swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void cyclicSort(int[] arr) {
        int pos = 0;

        while (pos < arr.length - 1) {
            int correct_index = arr[pos] - 1;

            if (pos != correct_index) {
                swap(pos, correct_index, arr);
            } else {
                pos++;
            }
        }
    }

    static void swap(int current_pos, int target_pos, int[] arr) {
        int temp = arr[current_pos];
        arr[current_pos] = arr[target_pos];
        arr[target_pos] = temp;
    }
}
