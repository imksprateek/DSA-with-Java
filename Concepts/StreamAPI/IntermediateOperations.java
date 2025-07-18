package Concepts.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //Intermediate operations are lazy operations. It means they are only executed when terminal operation is used in the code. Otherwise not

        //filter: filters the element
        Stream<String> nameStream = Stream.of("Prateek", "Shrayansh", "Saul", "Walter");
        Stream<String> filteredStream = nameStream.filter((String name) -> name.length() < 5);
        List<String> filteredList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredList);


        //map: Used to transform each element
        Stream<String> nameStream2 = Stream.of("JADE", "Colin", "Steve");
        Stream<String> filteredNames = nameStream2.map((String name) -> name.toLowerCase());
        System.out.println(filteredNames.collect(Collectors.toList()));

        //flatMap: Used tp iterate over each element of a complex collection and helps to flatten it
        List<List<String>> nameList = Arrays.asList(Arrays.asList("I","AM","STUPID"), Arrays.asList("I'M","STUPID"), Arrays.asList("I", "AM", "STEW", "PID"));

        Stream<String> nameListStream1 = nameList.stream().flatMap((List<String> num) -> num.stream());
        System.out.println(nameListStream1.collect(Collectors.toList()));

        Stream<String> nameListStream2 = nameList.stream().flatMap((List<String> sentence) -> sentence.stream().map((String value) -> value.toLowerCase()));
        System.out.println(nameListStream2.collect(Collectors.toList()));

        //mapToInt : Helps to work with primitive "int" datatype. Similarly mapToLong and mapToDouble exist
        List<String> numbers = Arrays.asList("2", "1", "4", "7");
        IntStream numberStream = numbers.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numberArray = numberStream.toArray();

        //sorted: Sorts the elements
        Integer[] arr = {1,2,5,4, 3, 3,7,9,6};
        //ascending
        Stream<Integer> arrStream = Arrays.stream(arr).sorted();
        System.out.println(arrStream.collect(Collectors.toList()));
        //descending
        Stream<Integer> arrStream2 = Arrays.stream(arr).sorted((Integer val1, Integer val2) -> val2-val1);
        System.out.println(arrStream2.collect(Collectors.toList()));

        //distinct: removes duplicates from the stream
        Integer[] arr2 = {2,6,4,4,5,9,6,6};
        Stream<Integer> noDupes = Arrays.stream(arr2).distinct();
        System.out.println(noDupes.collect(Collectors.toList()));

        //limit : Truncate the stream to have no longer than given max size
        List<Integer> nums = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numsStream = nums.stream().limit(2);
        System.out.println(numsStream.collect(Collectors.toList()));

        //skip the first n elements of the stream
        List<Integer> nums2 = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numsStream2 = nums.stream().skip(2);
        System.out.println(numsStream2.collect(Collectors.toList()));

        //peek: helps to see the immediate result of the stream which is getting processed
        List<Integer> integers = Arrays.asList(2,1,4,6);
        Stream<Integer> integerStream = integers.stream()
                .filter((Integer val) -> val>2)
                .peek((Integer val) -> System.out.println(val))
                .map((Integer val) -> -1*val);

        System.out.println(integerStream.collect(Collectors.toList()));


        //Lazy demonstration
        withoutTerminalOp(); //doesn't print
        withTerminalOp(); //prints
    }

    public static void withoutTerminalOp(){
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream().filter((Integer val) -> val>=3).peek((Integer val) -> System.out.println(val));
    }

    public static void withTerminalOp(){
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream().filter((Integer val) -> val>=3).peek((Integer val) -> System.out.println(val));
        numberStream.count(); //count is also a terminal operation
    }
}
