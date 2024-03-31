package oops.polymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();

        Shapes circle2 = new Circle();
        circle2.area();

        //Even though only the methods of Shapes class should be accessible here, the area method of Circle class is overriding
        //Parent obj = new Child();
        //Here, Parent is Reference type, Child is object type
        //Overriding depends on Type of the Object and not the Reference Type
        //Reference type determines which one to access, Object type determines which version of the method to run

        //How Overriding works-
        //Parent obj = new Child();
        //Here which method will be called depends on child class
        //This is known as Upcasting


        //Dynamic Method Dispatch - Java deciding which method to run during runtime in Dynamic Inheritence
    }
}
