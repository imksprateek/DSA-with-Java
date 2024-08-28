package CreationalDesignPatterns.AbstractFactoryPattern.Cars;

import CreationalDesignPatterns.AbstractFactoryPattern.Car;

public class EconomyCar2 implements Car {
    @Override
    public void getTopSpeed() {
        System.out.println("Economy Car 2 top speed");
    }
}
