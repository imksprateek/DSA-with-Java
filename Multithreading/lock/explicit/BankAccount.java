package Multithreading.lock.explicit;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    //For Explicit lock we need to create a Lock object. After a thread calls Lock.lock() method when other threads call tryLock() they get an indication that lock is in use by the other thread. So it waits
    //Reentrantlock() is an implementation of Lock
    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        //tryLock() method is used to acquire the lock. If the lock is not available then it returns false. If the lock is available then it returns true and the lock is acquired.
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " has enough balance to withdraw " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdraw " + amount + ". Balance is " + balance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " withdraw " + amount + ". Not enough balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock. Exiting");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
