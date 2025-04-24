package LLD.CreationalDesignPatterns.SingletonPattern;

public class Main {
    /* There are 4 types of singleton design pattern:
    They are:
    Eager initialization
    Lazy initialization
    synchronized method
    Double locking
     */
    // Double Locking is mostly used in the industry. This code depicts Double Locking

    public static void main(String[] args) {
        DBconnection newObj = DBconnection.getInstance();
        newObj.printHello();
    }
}
