package creationalDesignPatterns.factoryMethod;

public class SeaLogisticsFactory implements LogisticsFactory {
    @Override
    public Transport getTransport() {
        return new SeaLogistics();
    }
}
