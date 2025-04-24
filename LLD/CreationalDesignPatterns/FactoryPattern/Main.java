package LLD.CreationalDesignPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        //In factory design pattern, the role of creation of objects is given to a class

        Shape myShape = ShapeFactory.getShapeInstance("circle");

        myShape.calculateArea();
    }
}
