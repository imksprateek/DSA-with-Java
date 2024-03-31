package oops.polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        System.out.println(obj.sum(3, 2));
        System.out.println(obj.sum(3, 2, 1));
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
