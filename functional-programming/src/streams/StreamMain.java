package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> initialValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> changedValues = initialValues.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .map(number -> number - 4)
                .collect(Collectors.toList());
    }
}
