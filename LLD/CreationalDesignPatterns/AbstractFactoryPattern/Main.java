package LLD.CreationalDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Abstract factory is factory of a factory

        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();

        AbstractFactory factory = factoryProducer.getFactory("Luxury");

        Car myCar = factory.getInstance(1230);

        myCar.getTopSpeed();

    }
}
