package creationalDesignPatterns.factoryMethod;

public class AirLogistics implements Transport{
    @Override
    public void getDeliver() {
        System.out.println("Air Logistics deliver...");
    }
}
