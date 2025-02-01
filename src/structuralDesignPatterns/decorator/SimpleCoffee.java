package structuralDesignPatterns.decorator;

// SimpleCoffee sinfi - əsas Coffee implementasiyası
public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0; // Sadə kofeinin qiyməti
    }
}
