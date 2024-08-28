package CreationalDesignPatterns.FactoryPattern;

public class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is pi * r^2");
    }
}
