package oops.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);

        son.career();
        System.out.println(son.age);

        Daughter daughter = new Daughter(21);

        daughter.career();
        System.out.println(daughter.age);


        //Creating objects of an abstract class is not allowed
//        Parent dad = new Parent(45);

        Parent.printHello();    //Static stuff can be directly accessed from a class without creating an object
    }
}
