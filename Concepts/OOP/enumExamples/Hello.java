package oops.enumExamples;

public interface Hello {
    default void hello() {
        System.out.println("Hello world!!");
    }
}
