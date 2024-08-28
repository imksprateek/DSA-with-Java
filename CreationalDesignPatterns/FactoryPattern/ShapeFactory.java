package CreationalDesignPatterns.FactoryPattern;

public class ShapeFactory {
    public static Shape getShapeInstance(String shapeType){
        if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}
