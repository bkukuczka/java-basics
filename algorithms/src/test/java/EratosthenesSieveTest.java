import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EratosthenesSieveTest {

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(10, Arrays.asList(2, 3, 5, 7)),
                Arguments.of(20, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)),
                Arguments.of(30, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void shouldReturnOnlyPrimeNumbersWithUpperBound(int upperLimit, List<Integer> expectedResult) {
        //when
        List<Integer> actualResult = EratosthenesSieve.findPrimeNumbers(upperLimit);

        //then
        assertEquals(actualResult, expectedResult);
    }
}