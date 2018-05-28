package priv.bluerhino.java.playground.leetcode.juc.nio;

import org.junit.Test;

/**
 * Created by niekunlin @ 18/5/12.
 */
public class NioHelloServerTest {

    @Test
    public void testHelloServer() throws InterruptedException {
        NioHelloServer nioHelloServer = new NioHelloServer(18888);
        Thread thread = new Thread(nioHelloServer);
        thread.start();
        thread.join();

    }

}