package CreationalDesignPatterns.AbstractFactoryPattern.Cars;

import CreationalDesignPatterns.AbstractFactoryPattern.Car;

public class LuxuryCar1 implements Car {
    @Override
    public void getTopSpeed() {
        System.out.println("Luxury Car 1 top speed");
    }
}
