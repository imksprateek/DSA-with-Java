package Multithreading.ThreadVsRunnable;

public class Mercedez extends Car implements Runnable{
    @Override
    public void run() {
        System.out.println("Running");
    }
}
