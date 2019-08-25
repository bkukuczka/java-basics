package generics;

import java.util.ArrayList;
import java.util.List;

public class ClassName<T extends Number> {

    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public List<? super Integer> process(List<? super Integer> list) {


        return list;
    }

    public void printAndClean(List<?> listOfAnything) {

    }

}
