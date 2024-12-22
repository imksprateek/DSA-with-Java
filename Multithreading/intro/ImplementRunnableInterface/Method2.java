package Multithreading.intro.ImplementRunnableInterface;

public class Method2 {
    public static void main(String[] args) {
        // If you're trying by implementing Runnable interface in World, you need to pass the object in the constructor of Thread class
        World world = new World();
        Thread t1 = new Thread(world);

        t1.start();

        for (;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
