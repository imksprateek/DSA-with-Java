package oops.InterfacesExtend2;


public interface B {
//    void fun();

    default void greet() {
        System.out.println("Hello");
    }
}
