package Multithreading.ThreadClassMethods;

public class InterruptThread extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running....");
        }catch(InterruptedException e){
            System.out.println("Thread was interrupted : " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        InterruptThread t1 = new InterruptThread();
        t1.start();
        //Interrupt thread t1
        //Interrupt stops the thread. Stops whatever the thread was doing
        t1.interrupt();
    }
}
