package vehicles;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {
    private String currentLocation;
    private Logger logger;

    public Car(String currentLocation) {
        this.currentLocation = currentLocation;
        logger = LoggerFactory.getLogger(Car.class);
    }

    public void drive(String driveTo) {
        logger.info("Driving from {} to {}.", currentLocation, driveTo);
    }
}
