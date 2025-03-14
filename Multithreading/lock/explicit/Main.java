package Multithreading.lock.explicit;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        //Interface cannot create class. So an anonymous class is created below instead of creating a separate class and extending it
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        //We're creating threads using Runnable interface so the Runnable object goes in arguments
        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}
