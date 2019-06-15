import vehicles.Taxi;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Taxi[] taxis = World.setup();

        TaxiService taxiService = new TaxiService(taxis);

        Taxi orderedTaxi = taxiService.orderTaxi(new Point(10, 5));

        System.out.println(orderedTaxi.getSideNumber());

    }
}
