package vehicles;

import java.awt.*;

public class Riksha extends Taxi {
    private Point location;
    private double avgSpeed = 5;

    public Riksha(boolean isOccupied, Point location) {
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
