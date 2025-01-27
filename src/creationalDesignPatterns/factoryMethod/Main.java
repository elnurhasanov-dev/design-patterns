package creationalDesignPatterns.factoryMethod;

import static creationalDesignPatterns.factoryMethod.TransportType.AIRPLANE;

public class Main {
    public static void main(String[] args) {
        LogisticsFactory logisticsFactory = createLogistiscsByType(AIRPLANE);
        Transport transport = logisticsFactory.getTransport();
        transport.getDeliver();
    }

    public static LogisticsFactory createLogistiscsByType(TransportType type) {
        return switch (type) {
            case TRUCK -> new RoadLogisticsFactory();
            case SHIP -> new SeaLogisticsFactory();
            case AIRPLANE -> new AirLogisticsFactory();
        };
    }
}
