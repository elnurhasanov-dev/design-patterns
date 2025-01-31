package structuralDesignPatterns.proxy.example2;

public class RealDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to database...");
    }
}
