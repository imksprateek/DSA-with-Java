package Multithreading.ThreadClassMethods;

public class YeildThread extends Thread{

    public YeildThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            //Hint to the scheduler that the current thread is willing to yeild its current use of processor. The OS scheduler is free to ignore this hint
            //Now after using yeild method the scheduler gives ALMOST equal chance to both threads
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YeildThread t1 = new YeildThread("Thread1");
        YeildThread t2 = new YeildThread("Thread2");

        t1.start();
        t2.start();
    }
}
