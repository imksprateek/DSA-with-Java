package CreationalDesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryProducer{
    public AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("Luxury")){
            return new LuxuryCarFactory();
        }
        if(factoryType.equalsIgnoreCase("Economy")){
            return new EconomyCarFactory();
        }
        return null;
    }
}
