package Concepts.OOP.Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Started Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Electric Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerated Electric Engine");

    }
}
