package Multithreading.synchronization;

public class Counter {
    private int count = 0;

    //part of the code where a shared resource is being accessed and modified is called Critical section, which leads to race condition. In this case, increment method. This is solved by using synchronized keyword
    //We made sure only one thread can access critical section at a time. This is called Mutual Exclusion
    //Here when t1 accessed increment method, the method is locked by t1 and hence t2 cannot access. When t1 has finished it's work, the method is accessed by t2 and t2 locks the method so that t1 cannot access until it finishes its work.
    public synchronized void increment(){

        /*
        synchronized block can also be used. This makes the code in the block synchronized for this instance:

        synchronized (this){
            count++;
        }
         */
        System.out.println(Thread.currentThread().getName());
        count++;
    }

    /*
    There are 2 types of locks.
    1. Intrinsic
    2. Explicit

    Intrinsic lock is done through synchronized keyword like described above.
    The synchronized keyword in Java provides basic thread-safety but has limitations:
    - it locks the entire method or block, leading to potential performance issues.
    - It lacks a try-lock mechanism, causing threads to block indefinitely, increasing the risk of deadlocks.
    - Additionally, synchronized doesn't support multiple condition variables, offering only a single monitor per object with basic wait/notify mechanisms.

    In contrast, explicit locks (Lock interface) offer
    - finer-grained control,
    - try-lock capabilities to avoid blocking,
    - and more sophisticated thread coordination through multiple condition variables, making them more flexible and powerful for complex concurrency scenarios.
     */

    public int getCount(){
        return count;
    }
}
