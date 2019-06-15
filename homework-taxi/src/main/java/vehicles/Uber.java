package vehicles;

import java.awt.*;

public class Uber extends Taxi {
    private Point location;
    private double avgSpeed = 12;

    public Uber(boolean isOccupied, Point location) {
        super(isOccupied);
        this.location = location;
    }

    public double timeToDestination(Point userLocation) {
        double distance = countDistance(userLocation);

        return distance / avgSpeed;
    }

    private double countDistance(Point userLocation) {
        return userLocation.distance(location);
    }
}
