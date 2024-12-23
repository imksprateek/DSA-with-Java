package Multithreading.ThreadClassMethods;

public class MyThread extends Thread{
    //Changing the default name of thread to a custom name using super class constructor
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            String a = "";
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
            for(int j=0; j<10000; j++){
                a += "R";
            }
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread("LowPriorityThread");
        MyThread t2 = new MyThread("MediumPriorityThread");
        MyThread t3 = new MyThread("HighPriorityThread");
        //Manually setting the priority. Priorities we set are a hint to the scheduler. It might not always be prioritized since the scheduler is free to ignore this hint
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
