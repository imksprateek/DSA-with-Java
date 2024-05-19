package oops.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Started Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerated Power Engine");

    }
}
