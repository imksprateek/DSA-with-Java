package LLD.CreationalDesignPatterns.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        //Prototype design pattern is used in cloning objects
        //Instead of creating a new object and copying values one by one, we give the role of cloning to the class itself

        ConcretePrototype obj = new ConcretePrototype("John");
        System.out.println(obj.getName());

        ConcretePrototype newObj = (ConcretePrototype) obj.Clone();
        System.out.println(newObj.getName());
    }
}
