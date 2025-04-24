package LLD.CreationalDesignPatterns.AbstractFactoryPattern;

import LLD.CreationalDesignPatterns.AbstractFactoryPattern.Cars.LuxuryCar1;
import LLD.CreationalDesignPatterns.AbstractFactoryPattern.Cars.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory{

    @Override
    public Car getInstance(int price) {
        if(price > 1000){
            return new LuxuryCar1();
        }
        if(price > 2000){
            return new LuxuryCar2();
        }
        return null;
    }
}
