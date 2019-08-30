package sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void shouldSortArrElements() {
        //given
        int[] arr = {3, 7, 3, 9, 2, 6, 3, 7, 5};
        int[] expected = {2, 3, 3, 3, 5, 6, 7, 7, 9};

        //when
        int[] result = InsertionSort.sort(arr);

        //then
        assertArrayEquals(result, expected);
    }
}