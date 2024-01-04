import java.util.*;

public class LeetCode_kidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        int len = candies.length;
        int max = 0;
        boolean[] booleanArray = new boolean[len];

        // Convert the boolean array to a List (if needed)
        List<Boolean> booleanList = new ArrayList<>();
        for (boolean value : booleanArray) {
            booleanList.add(false);
        }
        boolean[] result = new boolean[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            int temp = candies[i];
            temp += extraCandies;
            for (int j = 0; j < len; j++) {
                if (temp >= candies[j]) {
                    count++;
                }
                System.out.println(count);
            }
            System.out.println(booleanList);
            if (count == len) {
                booleanList.set(i, true);
            }
        }
        System.out.println(booleanList);

    }
}
