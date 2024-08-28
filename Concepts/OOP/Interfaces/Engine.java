package Concepts.OOP.Interfaces;

public interface Engine {
    //In interfaces, every variable is static and final by default
    //Multiple Inheritence is allowed in Interfaces, but not in classes

    static final int price = 70000;

    void start();

    void stop();

    void accelerate();
}
