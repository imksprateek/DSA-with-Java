package Concepts.Recursion.ProblemsForConcept.arrays;

public class FindIfAnArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 10};
        System.out.println(helper(arr));
    }

    public static boolean helper(int[] arr){
        return checkSorted(arr, 0);
    }

    public static boolean checkSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return checkSorted(arr, index+1);
        }
        return false;
    }
}
