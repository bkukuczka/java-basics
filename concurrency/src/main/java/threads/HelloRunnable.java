package threads;

public class HelloRunnable implements Runnable {
    private Counter counter;

    public HelloRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increment();
        }
    }
}
