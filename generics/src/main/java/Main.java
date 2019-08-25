import generics.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List castList = new ArrayList();
        castList.add("hello");
        String castHello = (String) castList.get(0);

        List<String> noCastlist = new ArrayList<>();
        noCastlist.add("hello");
        String noCastHello = noCastlist.get(0);


        ClassName<Integer> newObject = new ClassName<>();

        newObject.add(1);

        Pair<Integer, String> pairOne = new Pair<>(1, "John Doe");
        Pair<Integer, String> pairTwo = new Pair<>(2, "Jane Doe");

        Util.compare(pairOne, pairTwo);

        SpecialBox<String> specialBoxChild = new SpecialBox<>("string value");


        List<Box<String>> boxList = new ArrayList<>();

        boxList.add(specialBoxChild);

        new


    }
}
