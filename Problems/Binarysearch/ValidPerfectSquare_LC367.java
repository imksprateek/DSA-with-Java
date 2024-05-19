public class ValidPerfectSquare_LC367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(19));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long mid_square = mid * mid;
            if (mid_square == num) {
                return true;
            }
            if (mid_square > num) {
                end = mid - 1;
            }
            if (mid_square < num) {
                start = mid + 1;
            }
        }
        return false;
    }
}
