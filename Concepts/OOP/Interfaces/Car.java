package Concepts.OOP.Interfaces;

public class Car implements Engine, Brake {
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
}
