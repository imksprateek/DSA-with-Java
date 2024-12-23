package Multithreading.ThreadClassMethods;

public class DaemonThread extends Thread{

    public DaemonThread(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Hello World!!");
        }
    }

    public static void main(String[] args) {
        //Threads that are created by user that does some work are called user threads.
        //JVM wait until user threads to finish their work. It never exit until all user threads finish their work
//        DaemonThread t1 = new DaemonThread("Thread1");
//        t1.start();

        //Daemon threads are low priority threads which always run in background and user threads are high priority threads which always run in foreground.
        // User Thread or Non-Daemon are designed to do specific or complex task where as daemon threads are used to perform supporting tasks.
        //The JVM will not wait for daemon threads to finish their work. The JVM will exit as soon as all user threads finish their work. That is, If all user threads have finished their work JVM will force the daemon threads to terminate

        /*
        JVM doesn’t wait for daemon thread to finish but it waits for User Thread :
        First and foremost difference between daemon and user threads is that JVM will not wait for daemon thread to finish its task but it will wait for any active user thread.
        For example, one might have noticed this behavior while running Java program in NetBeans that even if the main thread has finished, the top left down button is still red, showing that Java program is still running.
        This is due to any user thread spawned from the main thread, but with main thread one don’t see that red dot in NetBeans.
         */

        DaemonThread t2 = new DaemonThread("DaemonThread");
        t2.setDaemon(true);
        t2.start();
        System.out.println("Main DONE");
        //In this case When Main thread finishes it's execution it terminates all daemon threads. This is why we see "Main DONE" printed at first even though it's the last statement and then t2 terminates.
    }
}
