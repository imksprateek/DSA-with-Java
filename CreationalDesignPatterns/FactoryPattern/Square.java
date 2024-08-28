package CreationalDesignPatterns.FactoryPattern;

public class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Area of square is a^2");
    }
}
