import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EuclidAlgorithmTest {

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(33, 11, 11),
                Arguments.of(24, 88, 8),
                Arguments.of(0, 39, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void shouldReturnBiggestCommonDivisorWhenTwoNumbersProvided(int numberOne, int numberTwo, int expectedResult) {
        //when
        int result = EuclidAlgorithm.findBiggestCommonDivisor(numberOne, numberTwo);

        //then
        assertEquals(expectedResult, result);
    }
}