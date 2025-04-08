package Concepts.DataStructures.Heaps;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static void main(String[] args) throws Exception {
        System.out.println(heapSort(new int[]{4,3,7,2,9}));
    }

    public static List<Integer> heapSort(int[] arr) throws Exception {
        Heap<Integer> heap = new Heap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            heap.insert(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            result.add(heap.remove());
        }

        return result;
    }
}
