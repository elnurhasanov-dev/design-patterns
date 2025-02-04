package structuralDesignPatterns.bridge.example2;

// Refined Abstraction
public class ItalianRestaurant extends Restaurant {
    protected ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setToppings(null);
    }

    @Override
    void addToppings() {
        pizza.setSauce("Oil");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
