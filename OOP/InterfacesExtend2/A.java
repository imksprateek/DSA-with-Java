package oops.InterfacesExtend2;

public interface A {

    //Static interface methods should always have a body, because static methods cannot be inherited
    //Call via the interface name like A.greeting();
//    static void greeting(); NOT ALLOWED

    static void greeting() {
        System.out.println("Have a good day.");
    }

    default void fun() {
        System.out.println("I'm in A");
    }
}
