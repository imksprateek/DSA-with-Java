package Problems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(comb("", "12"));
        System.out.println(countComb("", "12"));
    }

    public static List<String> comb(String processed, String unprocessed){
        List<String> result = new ArrayList<>();
        if(unprocessed.isEmpty()){
            result.add(processed);
            return result;
        }

        int digit = unprocessed.charAt(0) - '0';

        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            result.addAll(comb(processed + ch, unprocessed.substring(1)));
        }

        return result;
    }

    public static int countComb(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = unprocessed.charAt(0) - '0';

        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a' + i);
            count = count + countComb(processed + ch, unprocessed.substring(1));
        }
        return count;
    }
}
