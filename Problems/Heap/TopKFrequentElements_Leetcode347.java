package Problems.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements_Leetcode347 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue()
        );

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        pq.addAll(map.entrySet());

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
