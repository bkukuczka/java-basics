package threads;

public class HelloThread extends Thread {
    private Counter counter;

    public HelloThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.decrement();
        }
    }
}

