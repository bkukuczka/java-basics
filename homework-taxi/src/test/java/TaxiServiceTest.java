import org.junit.jupiter.api.Test;
import vehicles.Taxi;
import vehicles.Uber;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    void shouldFindClosestNotOccupiedTaxi() {
        //given
        Taxi[] testTaxis = new Taxi[3];
        testTaxis[0] = new Uber(true, new Point(3, 3));
        testTaxis[1] = new Uber(false, new Point(4, 4));
        testTaxis[2] = new Uber(false, new Point(6, 6));
        TaxiService taxiService = new TaxiService(testTaxis);
        Point userLocation = new Point(0, 0);
        Taxi expectedTaxi = testTaxis[1];

        //when
        Taxi actualTaxi = taxiService.orderTaxi(userLocation);

        //then
        assertSame(expectedTaxi, actualTaxi);
    }
}