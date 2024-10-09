package Problems.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiceSum {
    public static void main(String[] args) {
        System.out.println(combinations("", 4));
    }

    public static List<String> combinations(String processed, int sum){
        List<String> result = new ArrayList<>();

        if(sum==0){
            result.add(processed);
            return result;
        }
        for (int i = 1; i <= 6; i++) {
            if(i<=sum) {
                result.addAll(combinations(processed + i, sum - i));
            }
        }

        return result;
    }
}
