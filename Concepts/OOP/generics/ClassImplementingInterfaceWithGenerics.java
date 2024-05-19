package oops.generics;

public class ClassImplementingInterfaceWithGenerics implements InterfaceWithGeneric<Integer> {

    @Override
    public void display(Integer value) {
        System.out.println(value);
    }
}
