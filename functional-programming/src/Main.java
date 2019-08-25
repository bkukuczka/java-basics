import interfaces.*;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {

        SimpleInterface simpleInterface = () -> Math.random() * 100;

        SecondInterface secondInterface = (a, b) -> a > b;

        AnotherInterface anotherInterface = msg -> System.out.println(msg);

        simpleInterface.onlyMethod();

        secondInterface.logicMethod(4, 9);

        anotherInterface.simplPrint("message");

        NumericInterface numericInterface = n -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };


        GenericExampleInterface<String> genericExampleInterface = (one, two) -> one + " " + two;

        genericExampleInterface.genericMethod("john", "doe");


        GenericExampleInterface<Integer> genericExampleInterfaceInt =
                (first, second) -> first + second;

        genericExampleInterfaceInt.genericMethod(10, 15);

        Callable onlyMethod = simpleInterface::onlyMethod;

        Runnable runnable = ArrayList::new;

        IntConsumer arr = int[]::new;

    }
}
