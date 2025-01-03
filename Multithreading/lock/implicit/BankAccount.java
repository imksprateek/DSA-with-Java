package Multithreading.lock.implicit;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawal ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining Balance: " + balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
        }
    }
}
