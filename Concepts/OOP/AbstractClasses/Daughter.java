package oops.AbstractClasses;

public class Daughter extends Parent {

    Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder.");
    }

    @Override
    void about() {
        System.out.println("I am daughter");
    }
}
