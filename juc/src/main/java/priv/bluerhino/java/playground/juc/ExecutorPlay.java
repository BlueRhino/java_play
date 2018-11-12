package priv.bluerhino.java.playground.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by niekunlin @ 18/9/3.
 *
 * @author niekunlin
 */
public class ExecutorPlay {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(() -> System.out.println(Thread.currentThread().getName()));
        executorService = null;
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutdown.")));
        Thread.sleep(100000);
        System.gc();
    }

}
