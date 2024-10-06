package Concepts.Recursion.ProblemsForConcept.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecursion {
    public static void main(String[] args) {
        System.out.println(permutate("", "abc").toString());
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
}
