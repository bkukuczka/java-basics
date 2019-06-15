package vehicles;

import java.awt.*;

public abstract class Taxi {
    private boolean isOccupied;
    private int sideNumber;

    public Taxi(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract double timeToDestination(Point userLocation);

    public void setSideNumber(int sideNumber) {
        this.sideNumber = sideNumber;
    }

    public int getSideNumber() {
        return sideNumber;
    }
}
