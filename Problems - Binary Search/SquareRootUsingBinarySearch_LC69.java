public class SquareRootUsingBinarySearch_LC69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            double mid = start + (end - start) / 2;
            double mid_square = mid * mid;
            if (mid_square == x) {
                return (int) mid;
            }
            if (mid_square < x) {
                start = (int) mid + 1;
            }
            if (mid_square > x) {
                end = (int) mid - 1;
            }
        }
        return end;
    }
}
