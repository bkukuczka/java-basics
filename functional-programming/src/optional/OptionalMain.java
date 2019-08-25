package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        List<String> list = anyMethod();

        if (list != null) {
            String someValue = list.get(0);
            if (someValue != null) {
                someValue.length();
            }
        }


        Optional<String> someValue;

        someValue = Optional.empty();

        someValue = Optional.of("some value");

    }

    private static List<String> anyMethod() {
        return new ArrayList<>();
    }

    public Optional<String> getStringValue(){
        return Optional.of("string value");
    }
}
