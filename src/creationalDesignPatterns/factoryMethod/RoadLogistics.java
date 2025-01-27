package creationalDesignPatterns.factoryMethod;

public class RoadLogistics implements Transport{
    @Override
    public void getDeliver() {
        System.out.println("Road Logistics deliver...");
    }
}
