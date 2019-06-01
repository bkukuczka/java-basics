package figures;

import exceptions.NegativeRadiusException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCountAreaWhenPositiveRadius() {
        //given
        double positiveRadius = 10;
        double expectedArea = 314.1592653589793;
        Circle circle = new Circle(positiveRadius);

        //when
        double actualArea = circle.countArea();

        //then
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldThrowExceptionWhenNegativeRadiusProvided() {
        //given
        double negativeRadius = -10;

        //when // then
        try {
            Circle circle = new Circle(negativeRadius);
            fail("Assertion should have been thrown.");
        } catch (NegativeRadiusException ex) {
            assertEquals(
                    ex.getMessage(),
                    "Radius should be positive value.");
        }
    }
}