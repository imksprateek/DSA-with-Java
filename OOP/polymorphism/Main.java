package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        //Poly = Multiple,    Morphism = Ways to represent
        //Representing the same thing in multiple ways


        /*
        Types of Polymorphism-

        1] Compile Time/ Static Polymorphism
        This is achieved via method overloading

        Method Overloading - Same method name, but types, arguments, return types, ordering can be different.
        Eg- Multiple constructors
        Shape hexagon = new Shape();
        Shape hexagon = new Shape(4,3,2,1,6,7);


        2]Runtime/ Dynamic Polymorphism
        Achieved by method overriding
         */

        Shapes shape = new Shapes();

        Circle circle = new Circle();

        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes sq = new Square();
        sq.area();
    }
}
