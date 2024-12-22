package Multithreading.intro.ExtendThreadClass;

public class Method1 {
    public static void main(String[] args) {
        //By extending Thread class in World
        World world = new World();  //stage NEW
        world.start();  //stage RUNNABLE

        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }
//        System.out.println(Thread.currentThread().getName());
    }
}
