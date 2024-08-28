package Concepts.OOP.AbstractClasses;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be Doctor");
    }

    @Override
    void about() {
        System.out.println("I am Son");
    }

}

