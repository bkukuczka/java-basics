package threads;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedStatement {
    private int nameCount;
    private int surnameCount;

    void countName() {
        synchronized (this) {
            nameCount++;
        }
    }

    void countSurname() {
        synchronized (this) {
            surnameCount++;
        }
    }
}

