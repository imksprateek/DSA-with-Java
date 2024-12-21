package Concepts.DataStructures.Hashmaps;

public class Main {
    public static void main(String[] args) throws Exception{
        HashMapCustom customMap = new HashMapCustom();

        customMap.put("Prateek", "BNG");
        customMap.put("Robert Downey Jr", "Los Angeles");
        customMap.put("Cristiano Ronaldo", "Lisbon");

        System.out.println(customMap.get("Prateek"));

        HashMapCustomOptimized optimized = new HashMapCustomOptimized<String, Integer>();

        optimized.put("Nandini", 5);
        optimized.put("Kaveri", 4);
        optimized.put("Shambhavi", 2);

        System.out.println(optimized.toString());
    }
}
