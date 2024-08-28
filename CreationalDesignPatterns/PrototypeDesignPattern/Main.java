package CreationalDesignPatterns.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype obj = new ConcretePrototype("John");
        System.out.println(obj.getName());

        ConcretePrototype newObj = (ConcretePrototype) obj.Clone();
        System.out.println(newObj.getName());
    }
}
