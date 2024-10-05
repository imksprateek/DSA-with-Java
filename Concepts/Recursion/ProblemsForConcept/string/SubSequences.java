package Concepts.Recursion.ProblemsForConcept.string;

import java.util.ArrayList;

public class SubSequences {
    // Subsequences whenever there's a need to make permutations and Combinations
    // Subsets in Arrays, Subsequences in Strings

    public static void main(String[] args) {
        subSeqPrint("", "abc");
        System.out.println(subSeqArr("", "abc").toString());
    }

    public static void subSeqPrint(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subSeqPrint(processed+ch, unprocessed.substring(1));
        subSeqPrint(processed,unprocessed.substring(1));
    }

    public static ArrayList<String> subSeqArr(String processed, String unprocessed){
        ArrayList<String> list = new ArrayList<String>();

        if(unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        list.addAll(subSeqArr(processed+ch, unprocessed.substring(1)));
        list.addAll(subSeqArr(processed,unprocessed.substring(1)));

        return list;
    }
}
