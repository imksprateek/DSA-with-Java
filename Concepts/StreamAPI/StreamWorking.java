package Concepts.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWorking {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val>3)
                .peek((Integer val) -> System.out.println("After filter: " + val))
                .map((Integer val) -> -1*val)
                .peek((Integer val) -> System.out.println("After negating: " + val))
                .sorted()
                .peek((Integer val) -> System.out.println("After sorted: " + val));

        List<Integer> result = numbersStream.collect(Collectors.toList());

        // some intermediate operations like sorted execute only when all elements are in the stream, So the flow is filter-negate till the last element and then sorted

        // Once a terminal operation is used on a stream it is closed and cannot be used again for another terminal operation

    }
}
