package Problems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceSumVaryingFaces {
    public static void main(String[] args) {
        System.out.println(combinations("", 4, 6));
    }

    public static List<String> combinations(String processed, int sum, int faces){
        List<String> result = new ArrayList<>();

        if(sum==0){
            result.add(processed);
            return result;
        }
        for (int i = 1; i <= faces; i++) {
            if(i<=sum) {
                result.addAll(combinations(processed + i, sum - i, faces));
            }
        }
        return result;
    }
}
