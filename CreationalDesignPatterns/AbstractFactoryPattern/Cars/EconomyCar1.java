package CreationalDesignPatterns.AbstractFactoryPattern.Cars;

import CreationalDesignPatterns.AbstractFactoryPattern.Car;

public class EconomyCar1 implements Car {
    @Override
    public void getTopSpeed() {
        System.out.println("Economy Car 1 Top Speed");
    }
}
