package structuralDesignPatterns.decorator;

// SugarDecorator - Concrete Decorator sinfi
public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Şəkərin qiyməti
    }
}
