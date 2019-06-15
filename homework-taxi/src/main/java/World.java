import vehicles.Taxi;

public class World {
    public static Taxi[] setup() {
        Taxi[] taxis = new Taxi[30];

        for (int i = 0; i < taxis.length; i++) {
            if (i % 2 == 0) {
                taxis[i] = TaxiFactory.createUber();
                taxis[i].setSideNumber(i);
            } else {
                taxis[i] = TaxiFactory.createRiksha();
                taxis[i].setSideNumber(i);
            }
        }

        return taxis;
    }
}
