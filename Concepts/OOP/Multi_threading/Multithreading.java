package oops.Multi_threading;

//We can either extend from Thread class or implement Runnable interface.
//If we implement the interface, the only thing we need to change is in main function we need to do the following changes-
//Thread myThread = new Thread(myThing);
//myThread.start();

//implementing Runnable class is preferred because if we extend from Thread class we can't extend from any other class since multiple inheritance is not allowed in Java.
//But, if we implement Runnable interface, we can extend from another class as well
public class Multithreading extends Thread {
    private int threadNumber;

    public Multithreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + "from thread" + this.threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
