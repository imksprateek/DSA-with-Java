package oops.polymorphism;

public class Circle extends Shapes {
    //This will run when an object of Circle is created
    //hence it is overriding the parent method
    //For overriding, only the body should be different and rest everything should be the same.
    @Override
    //This is called Annotation. Used for Check purpose, to check whether a method is overriding or not.
    void area() {
        System.out.println("Area is pi*r^2");
    }
}
