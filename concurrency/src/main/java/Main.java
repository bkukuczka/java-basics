import threads.Counter;
import threads.HelloRunnable;
import threads.HelloThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.*;

public class Main {

    public static void main(String args[]) throws InterruptedException {

        Counter counter = new Counter();

        Thread runnableThread = new Thread(new HelloRunnable(counter));
        runnableThread.start();

        HelloThread helloThread = new HelloThread(counter);
        helloThread.start();

        Thread.sleep(1000);
        System.out.println(counter.getCounter());

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(runnableThread);

        new AtomicBoolean();
        new AtomicInteger();
        new AtomicLong();
        new AtomicIntegerArray(10);
        new AtomicLongArray(10);



    }
}

