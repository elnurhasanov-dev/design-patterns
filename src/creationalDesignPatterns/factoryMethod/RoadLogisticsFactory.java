package creationalDesignPatterns.factoryMethod;

public class RoadLogisticsFactory implements LogisticsFactory {
    @Override
    public Transport getTransport() {
        return new RoadLogistics();
    }
}
