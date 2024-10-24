package Problems.Recursion.ProblemsForConcept.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        System.out.println(subSet(new int[]{1,2,3}));
        System.out.println(subSetIgnoreDuplicates(new int[] {1,2,3,2,1}));
        System.out.println(subSetIncludeDuplicates(new int[] {1,2,3,2}));
    }

    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int size = outer.size();
            for(int i=0; i<size; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetIgnoreDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int prev = 0;
        for(int num : arr){
            int size = outer.size();
            if(num != prev){
                for(int i=0; i<size; i++){
                    ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                    inner.add(num);
                    outer.add(inner);
                }
            }
            prev = num;
        }
        return outer;
    }

    public static List<List<Integer>> subSetIncludeDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            start = 0;

            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }

            end = outer.size() - 1;
            int size = outer.size();

            for(int j=start; j<size; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
