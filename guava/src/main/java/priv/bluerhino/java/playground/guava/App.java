package priv.bluerhino.java.playground.guava;

import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {



        RateLimiter rateLimiter = RateLimiter.create(1, 8, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        Stopwatch stopwatch = Stopwatch.createStarted();
        for (int i = 0; i < 20; i++) {
            stopwatch.reset();
            stopwatch.start();
            rateLimiter.acquire(1);
            System.out.println(stopwatch.elapsed(TimeUnit.MICROSECONDS));
            Thread.sleep(1000);
        }
        RateLimiter rateLimiter2 = RateLimiter.create(1);
        Thread.sleep(5000);
        System.out.println("-------------");
//        Thread.sleep(2000);
        for (int i = 0; i < 10; i++) {
            stopwatch.reset();
            stopwatch.start();
            rateLimiter2.acquire(1);
            System.out.println(stopwatch.elapsed(TimeUnit.MICROSECONDS));
            Thread.sleep(1000);
        }
    }
}
