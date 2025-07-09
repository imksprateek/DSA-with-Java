package Concepts.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        //Streams is used when collection has large number of elements (bulk)

        /*
        Stream does not make changes in the original collection. It returns a value/new collection

        3 steps:

        1. Create Stream: .stream() method

        2. Intermediate operation: .filter(), .sorted(), .map() (Intermediate operation is optional. It can be 0 or multiple).
            Each Intermediate operations create a new stream

        3. Terminal operation: .count(), .reduce(), .collect() (Terminal operation is mandatory)

         */

        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(10);
        list.add(18);
        list.add(15);

        System.out.println(withoutStream(list));
        System.out.println(withStream(list));
    }

    public static int withoutStream(List<Integer> list){
        int count = 0;

        for(int i=0; i< list.size(); i++){
            if(list.get(i) >= 15){
                count++;
            }
        }
        return count;
    }

    public static int withStream(List<Integer> list){
        long count = list.stream().filter((Integer val) -> val>=15).count();

        return (int) count;
    }
}
