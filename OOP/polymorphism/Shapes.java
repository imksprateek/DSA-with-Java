package oops.polymorphism;

//final keyword can be used to prevent inheritence
//public final class Shapes {
//Whenever a class is declared final, all it's method will be final too implicitly
public class Shapes {

    void area() {
        System.out.println("I am in Shapes");
    }


    //final keyword is used to prevent overriding or inheritence. This is called early binding
//    final void area() {
//        System.out.println("I am in Shapes");
//    }

    //    static methods cannot be overriden because overriding depends on object but static doesn't depend on object
    static void greeting() {
        System.out.println("Greeting from Shapes!");
    }

}
