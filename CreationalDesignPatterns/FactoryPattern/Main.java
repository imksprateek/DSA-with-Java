package CreationalDesignPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape myShape = ShapeFactory.getShapeInstance("circle");

        myShape.calculateArea();
    }
}
