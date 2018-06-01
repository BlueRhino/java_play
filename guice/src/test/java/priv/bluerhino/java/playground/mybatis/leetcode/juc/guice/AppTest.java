package priv.bluerhino.java.playground.mybatis.leetcode.juc.guice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void tomSayHello() {
        App app = new App();
        String jerry = app.tomSayHello("Jerry");
        Assert.assertEquals("Hello Jerry.I'm tom.", jerry);
    }
}
