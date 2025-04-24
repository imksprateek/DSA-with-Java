package Problems.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency_Leetcode451 {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue()
        );

        pq.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();

            for(int i=0; i<entry.getValue(); i++){
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }
}
