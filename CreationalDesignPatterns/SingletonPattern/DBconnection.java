package CreationalDesignPatterns.SingletonPattern;

public class DBconnection {
    private static DBconnection obj;

    private DBconnection() {

    }

    public static DBconnection getInstance() {
        if(obj == null) {
            synchronized (DBconnection.class) {
                if(obj == null) {
                    obj = new DBconnection();
                }
            }
        }
        return obj;
    }

    public void printHello(){
        System.out.println("Hello World");
    }
}
