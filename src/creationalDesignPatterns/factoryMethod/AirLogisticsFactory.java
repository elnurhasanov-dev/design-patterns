package creationalDesignPatterns.factoryMethod;

public class AirLogisticsFactory implements LogisticsFactory {
    @Override
    public Transport getTransport() {
        return new AirLogistics();
    }
}
