package LLD.CreationalDesignPatterns.AbstractFactoryPattern.Cars;

import LLD.CreationalDesignPatterns.AbstractFactoryPattern.Car;

public class LuxuryCar2 implements Car {
    @Override
    public void getTopSpeed() {
        System.out.println("Luxury car 2 top speed");
    }
}
