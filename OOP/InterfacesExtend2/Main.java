package oops.InterfacesExtend2;

public class Main implements A, B {

    //Interface to Interface - Extends
    // Classes to Interface - Implements

    //Here we are implementing both A and B even though the class implements B

    @Override
    public void greet() {
        System.out.println("greeting");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
