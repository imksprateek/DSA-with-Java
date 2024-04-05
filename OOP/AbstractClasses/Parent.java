package oops.AbstractClasses;


//There cannot be a final abstract class since final prevents inheritance of the abstract class, but an abstract class should be overriden.
public abstract class Parent {

    int age;

    final float VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 3.142f;
    }

    //If atleast one of the methods is abstract, the class needs to be abstract as well.
    //Abstract constructors are not Allowed
    //Abstract static methods are not allowed
    //Static methods can be created in Abstract class
    //Abstract classes cannot be created as static
    static void printHello() {
        System.out.println("Hello");
    }

    abstract void career();

    abstract void about();
}
