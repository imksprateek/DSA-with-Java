import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(5324523, 23432, 21, 33, 12);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
