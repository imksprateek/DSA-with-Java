package LLD.CreationalDesignPatterns.AbstractFactoryPattern;

import LLD.CreationalDesignPatterns.AbstractFactoryPattern.Cars.EconomyCar1;
import LLD.CreationalDesignPatterns.AbstractFactoryPattern.Cars.EconomyCar2;

public class EconomyCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price <= 500){
            return new EconomyCar1();
        }
        if(price <= 1000){
            return new EconomyCar2();
        }
        return null;
    }
}
