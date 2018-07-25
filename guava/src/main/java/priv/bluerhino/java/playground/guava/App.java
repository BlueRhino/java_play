package priv.bluerhino.java.playground.guava;

import com.google.common.util.concurrent.RateLimiter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RateLimiter rateLimiter = RateLimiter.create(1);
        rateLimiter.acquire();
        System.out.println(System.currentTimeMillis());
        rateLimiter.acquire();
        System.out.println(System.currentTimeMillis());
        rateLimiter.acquire();
        System.out.println(System.currentTimeMillis());
    }
}
