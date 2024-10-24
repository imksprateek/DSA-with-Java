package Problems.Recursion.ProblemsForConcept.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecursion {
    public static void main(String[] args) {
        System.out.println(permutate("", "abc").toString());
        System.out.println(permutate("", "abcd").toString());
        System.out.println(countPermutations("", "abcd"));
    }

    public static List<String> permutate(String processed, String unprocessed){
        List<String> result = new ArrayList<String>();
        if(unprocessed.isEmpty()){
            result.add(processed);
            return result;
        }

        char ch = unprocessed.charAt(0);
        for(int i=0; i<processed.length()+1; i++){
            String start = processed.substring(0,i);
            String end = processed.substring(i,processed.length());

            result.addAll(permutate(start+ch+end, unprocessed.substring(1)));
        }

        return result;
    }

    public static int countPermutations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for(int i=0; i<unprocessed.length();i++){
            String start = unprocessed.substring(0,i);
            String end = unprocessed.substring(i,unprocessed.length());
            count = count + countPermutations(start + ch + end, unprocessed.substring(1));
        }
        return count;
    }
}
