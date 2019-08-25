package vehicles;

import exceptions.InvalidLocationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class UberTest {

    private static final boolean ANY_BOOLEAN = true;
    private static final int ANY_NEGATIVE_VALUE = -4;

    @Test
    void shouldCountProperDistanceWhenStartAndEndLocationProvided() {
        //GIVEN
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Uber testedObject = new Uber(ANY_BOOLEAN, startPoint);
        double expectedDistance = 5;
        double actualDistance = 0;

        //WHEN
        try {
            actualDistance = testedObject.countDistance(endPoint);
        } catch (InvalidLocationException e) {
            fail(String.format("Exception %s has been thrown.",
                    e.getClass().toString()));
        }

        //THEN
        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void shouldThrowExceptionWhenUserLocationIsNegative() {
        //GIVEN
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, ANY_NEGATIVE_VALUE);
        Uber testedObject = new Uber(ANY_BOOLEAN, startPoint);

        //WHEN
        try {
            testedObject.countDistance(endPoint);
            fail("Exception has not been thrown.");
        } catch (InvalidLocationException e) {
        }
    }

    @Test
    void shouldReturnTimeWhenUserLocationProvided() {
        //given
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(9, 16);
        Uber testedObject = new Uber(ANY_BOOLEAN, startPoint);
        double expectedTime = 1.529796645890485;
        double actualTime = 0;

        //when
        actualTime = testedObject.timeToDestination(endPoint);

        //then
        Assertions.assertEquals(expectedTime, actualTime);
    }
}