package structuralDesignPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        // Sadə kofe
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Südlü kofe
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        // Südlü və şəkərli kofe
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());

        // Simple Coffee $5.0
        // Simple Coffee, Milk $6.5
        // Simple Coffee, Milk, Sugar $7.0
    }
}
