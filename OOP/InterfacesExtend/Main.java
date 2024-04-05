package oops.InterfacesExtend;

public class Main implements B {

    //Interface to Interface - Extends
    // Classes to Interface - Implements

    //Here we are implementing both A and B even though the class implements B
    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void greet() {
        System.out.println("greeting");
    }
}
