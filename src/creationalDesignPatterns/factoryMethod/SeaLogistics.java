package creationalDesignPatterns.factoryMethod;

public class SeaLogistics implements Transport{
    @Override
    public void getDeliver() {
        System.out.println("Sea Logistics deliver...");
    }
}
