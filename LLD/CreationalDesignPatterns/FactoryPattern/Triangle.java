package LLD.CreationalDesignPatterns.FactoryPattern;

public class Triangle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of Triangle is (1/2) * b * h");
    }
}
