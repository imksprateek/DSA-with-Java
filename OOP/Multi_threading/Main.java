package oops.Multi_threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Multithreading myThing = new Multithreading();
//        Multithreading myThing2 = new Multithreading();
//
//        //Running in single thread
//        myThing.run();
//        myThing2.run();
//
//        //Running in multiple threads (2 threads at a time)
//        myThing.start();
//        myThing2.start();

        //Running 5 threads at a time
        for (int i = 0; i < 5; i++) {
            Multithreading myThing = new Multithreading(i);
            myThing.start();
            //.join() method makes the next threads wait for the current thread to complete
            //kind of defeats the purpose of multi threading
//            myThing.join();

//            .isAlive() method returns a boolean whether a thread is currently running
//            myThing.isAlive();
        }

        //Even if one thread throws an exception, other threads keep running
        //Threads don't run in any specific order
    }
}
