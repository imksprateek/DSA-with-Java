package Concepts.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accelerate();
        car.start();
        car.stop();
        car.brake();

        Engine car2 = new Car();
        car2.accelerate();
        car2.start();
        car2.stop();
//      We can't do car2.brake() here since the reference type is Engine and brake method is not in engine

        NiceCar newcar = new NiceCar();
        newcar.start();
        newcar.stop();
        newcar.startMusic();

        newcar.upgradeEngine();
        newcar.start();
        newcar.stop();

    }
}
