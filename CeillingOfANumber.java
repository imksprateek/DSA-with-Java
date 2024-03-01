//To find ceiling of a number
public class CeillingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 11, 16, 18, 19, 21, 27};
        int target = 17;
        int ans = ceiling(arr, target);
        System.out.println("Found at position: " + ans);
        System.out.println("Ceiling: " + arr[ans]);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean is_OA = arr[start] < arr[end];
        if ((is_OA && target > arr[arr.length - 1]) || (!is_OA && target > arr[0])) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (is_OA) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
