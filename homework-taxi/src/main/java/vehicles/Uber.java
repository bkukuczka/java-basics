package vehicles;

import exceptions.InvalidLocationException;

import java.awt.*;

public class Uber extends Taxi {
    private Point location;
    private double avgSpeed = 12;

    public Uber(boolean isOccupied, Point location) {
        super(isOccupied);
        this.location = location;
    }

    public double timeToDestination(Point userLocation) {
        double distance = 0;
        try {
            distance = countDistance(userLocation);
        } catch (InvalidLocationException e) {
            distance = 0;
            System.out.println(
                    "Negative user location provided." +
                            " Distance falls to default 0 value.");
        }

        return distance / avgSpeed;
    }

    public double countDistance(Point userLocation) throws InvalidLocationException {
        if (userLocation.getX() < 0 ||
                userLocation.getY() < 0) {
            throw new InvalidLocationException("Location cannot be negative.");
        }

        return userLocation.distance(location);
    }
}
