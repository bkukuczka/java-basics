import vehicles.Riksha;
import vehicles.Taxi;
import vehicles.Uber;

import java.awt.*;
import java.util.Random;

public class TaxiFactory {

    public static Uber createUber() {
        return new Uber(generateIsOccupied(), new Point(getInt(), getInt()));
    }

    public static Riksha createRiksha() {
        return new Riksha(generateIsOccupied(), new Point(getInt(), getInt()));
    }

    private static boolean generateIsOccupied() {
        return new Random().nextBoolean();
    }

    private static int getInt() {
        return (new Random().nextInt()) % 100;
    }
}
