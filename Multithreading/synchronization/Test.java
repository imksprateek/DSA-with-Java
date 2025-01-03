package Multithreading.synchronization;

public class Test {
    public static void main(String[] args) {
        //Let's consider a scenario where both threads share the same object

        //Without using synchronized keyword in increment method, there's no guarantee that the value of count will be 2000 even though both threads are incrementing. This results in a race condition when both threads try to increment the count variable concurrently.
        //Without synchronization, one thread might read the value of count before the other thread has finished writing its incremented value. This can lead to both threads reading the same value, incrementing it, and writing it back, effectively losing one of the increments. hence the values of count are sometimes 1782, 1852, 2000
        //To solve this we use synchronized keyword to increment method

        //By synchronizing the increment method, you ensure that only one thread can execute this method at a time, which prevents the race condition. With this change, the output will consistently be 2000.

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
