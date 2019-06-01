package figures;

import exceptions.NegativeRadiusException;

public class Circle {
    private double radius;

    public Circle(double radius) {
        checkIfPositive(radius);

        this.radius = radius;
    }

    private void checkIfPositive(double radius) {
        if (radius <= 0) {
            throw new NegativeRadiusException(
                    "Radius should be positive value.");
        }
    }

    public double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
