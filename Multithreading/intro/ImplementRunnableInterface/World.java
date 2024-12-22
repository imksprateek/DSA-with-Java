package Multithreading.intro.ImplementRunnableInterface;

public class World implements Runnable{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
