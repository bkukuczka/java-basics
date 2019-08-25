package generics;

import java.io.Serializable;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> firstPair, Pair<K, V> secondPair) {
        return firstPair.getKey().equals(secondPair.getKey()) &&
                firstPair.getValue().equals(secondPair.getValue());
    }

    public <T extends Number & Serializable> boolean isPositive(){

         return true;
    }
}
