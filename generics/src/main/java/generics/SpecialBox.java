package generics;

public class SpecialBox<T extends CharSequence> extends Box<T> {
    private T value;

    public SpecialBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

