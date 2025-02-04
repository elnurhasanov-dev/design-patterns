package structuralDesignPatterns.bridge.example2;

public class Main {
    public static void main(String[] args) {
        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(pepperoniPizza);
        americanRestaurant.deliver();

        System.out.println("\n" + "------------------" + "\n");

        VeggiePizza veggiePizza = new VeggiePizza();
        ItalianRestaurant italianRestaurant = new ItalianRestaurant(veggiePizza);
        italianRestaurant.deliver();
    }
}
