package oops.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    //    Lambda functions are inline functions (One line)
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.forEach((item) -> System.out.println(item * 2));
//        forEach method takes a Consumer type input
//        Consumer represents an operation that accepts single input type and returns no result
//        We can store lambda functions in variables of type Interface
//        We can also store lambda expressions in variables. This can be implemented with-
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, prod));
        System.out.println(myCalc.operate(5, 3, sub));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}


