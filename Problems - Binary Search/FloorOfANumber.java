public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 11, 16, 18, 19, 21, 27};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println("Found at position: " + ans);
        System.out.println("Floor: " + arr[ans]);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean is_OA = (arr[start] < arr[end]);
        if ((is_OA && target < arr[arr.length - 1]) || (!is_OA && target < arr[0])) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (is_OA) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (!(is_OA)) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}
