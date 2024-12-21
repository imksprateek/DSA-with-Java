package Concepts.DataStructures.Hashmaps;

import java.util.*;

public class HashMapDefault {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("prateek", 99);
        map.put("batman", 999);
        map.put("ironman", 99999);

        System.out.println(map.get("ironman"));
        System.out.println(map.getOrDefault("superman", 007));
        System.out.println(map.containsKey("prateek"));


        //Hashset doesn't include duplicate elements and stores in sorted order
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(76);
        set.add(78);
        set.add(76);
        set.add(77);

        System.out.println(set.toString());
    }


}
