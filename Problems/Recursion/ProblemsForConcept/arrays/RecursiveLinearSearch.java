package Problems.Recursion.ProblemsForConcept.arrays;

import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,6,8,9};
        System.out.println("Found: " + checkIfPresent(arr, 7, 0));
        System.out.println("Found at index: " + helper(arr, 7));
        System.out.println("Multiple occurrences: " + findMultipleOccurances(arr, 6,0,new ArrayList<Integer>()));
        System.out.println("Multiple occurrences without passing the arraylist in parameters: " + findMultipleOccurancesWithoutPassing(arr, 6, 0));
    }

    public static int helper(int[] arr, int key){
        return search(arr, key, 0);
    }

    public static int search(int[] arr, int key, int current){
        if(current == arr.length){
            return -1;
        }
        if(key == arr[current]){
            return current;
        }
        return search(arr, key, current+1);
    }

    public static boolean checkIfPresent(int[] arr, int key, int current){
        if(current == arr.length){
            return false;
        }
        return arr[current] == key || checkIfPresent(arr, key, current+1);
    }

    public static ArrayList<Integer> findMultipleOccurances(int[] arr, int key, int current, ArrayList<Integer> indices){

        if(current == arr.length){
            return indices;
        }
        if(arr[current] == key){
            indices.add(current);
        }
        return findMultipleOccurances(arr, key, current+1, indices);
    }

    public static ArrayList<Integer> findMultipleOccurancesWithoutPassing(int[] arr, int key, int current){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(current == arr.length){
            return result;
        }
        if(arr[current] == key){
            result.add(current);
        }
        ArrayList<Integer> resultFromNextCalls = findMultipleOccurancesWithoutPassing(arr, key, current+1);
        resultFromNextCalls.addAll(result);
        return resultFromNextCalls;
    }
}
