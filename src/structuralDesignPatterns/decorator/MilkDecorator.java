package structuralDesignPatterns.decorator;

// MilkDecorator - Concrete Decorator sinfi
class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5; // Südün qiyməti
    }
}
