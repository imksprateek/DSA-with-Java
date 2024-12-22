package Multithreading.ThreadLifecycle;

public class MyThread extends Thread{

    /*
    The lifecycle of a thread in Java consists of several states, which a thread can move through during its execution.

    1. New: A thread is in this state when it is created but not yet started.
    2. Runnable: After the start method is called, the thread becomes runnable. It’s ready to run and is waiting for CPU time.
    3. Running: The thread is in this state when it is executing.
    4. Blocked/Waiting: A thread is in this state when it is waiting for a resource or for another thread to perform an action.
    5. Terminated: A thread is in this state when it has finished executing.
    */

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
            System.out.println("t1 Thread slept for 2 seconds");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        //Sleeping Main thread to give time for execution of t1 thread
        Thread.sleep(100);
        //TIMED_WAITING state while the thread is sleeping for 2000 ms in run method of the Thread
        System.out.println(t1.getState());
        //When join method is called from a thread, the caller thread waits for the callee thread to die and then continues its execution
        t1.join();
        System.out.println(t1.getState());
    }
}
