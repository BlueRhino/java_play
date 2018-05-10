package priv.bluerhino.java.playground.nio;

import org.junit.Test;

/**
 * Created by niekunlin @ 18/5/10.
 */
public class NioHelloServerTest {

    @Test
    public void testNioServer() throws InterruptedException {
        NioHelloServer nioHelloServer = new NioHelloServer(18888);
        Thread thread = new Thread(nioHelloServer);
        thread.start();
        thread.join();
    }

}