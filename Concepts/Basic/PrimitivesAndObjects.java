package Concepts.Basic;

import java.util.Arrays;

public class PrimitivesAndObjects {
    public static void main(String[] args) {
        String some_text = "Some Text";
        int[] arr = {43, 3243, 2432};
        int number = 998;
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array) {
        array[0] = 69;
    }
}
