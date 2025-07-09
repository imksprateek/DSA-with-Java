package Concepts.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateAStream {
    public static void main(String[] args) {
        // From Collection
        List<Integer> list = Arrays.asList(3000, 4000, 8000, 6000);
        Stream<Integer> streamFromIntegerList = list.stream();

        //From Array
        Integer[] arr = {3000, 4000, 8000, 6000};
        Stream<Integer> streamFromArr = Arrays.stream(arr);

        //From static method
        Stream<Integer> streamFromStaticMethod = Stream.of(1000, 2000, 8000, 6000);

        //From Stream Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

        // From stream iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);
        System.out.println(streamFromIterate.toList());


    }
}
