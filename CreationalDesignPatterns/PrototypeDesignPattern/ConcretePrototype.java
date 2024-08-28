package CreationalDesignPatterns.PrototypeDesignPattern;

public class ConcretePrototype implements Prototype{
    private String name;

    ConcretePrototype(String name){
        this.name = name;
    }

    public Prototype Clone(){
        return new ConcretePrototype(this.name);
    }

    public void printHelloWorld(){
        System.out.println("Hello World!");
    }

    public String getName() {
        return name;
    }
}
