import vehicles.Taxi;

import java.awt.*;

public class TaxiService {
    private Taxi[] taxis;

    public TaxiService(Taxi[] taxis) {
        this.taxis = taxis;
    }

    public Taxi orderTaxi(Point userLocation) {
        Taxi mostOptimalTaxi = taxis[0];
        double mostOptimalTime = Double.MAX_VALUE;

        for (Taxi taxi : taxis) {
            if (taxi.isOccupied()) {
                continue;
            }

            double checkedTaxiTime = taxi.timeToDestination(userLocation);

            if (checkedTaxiTime < mostOptimalTime) {
                mostOptimalTaxi = taxi;
            }

        }

        return mostOptimalTaxi;
    }
}
