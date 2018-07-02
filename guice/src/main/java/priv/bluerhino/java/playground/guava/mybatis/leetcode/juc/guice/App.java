package priv.bluerhino.java.playground.guava.mybatis.leetcode.juc.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import priv.bluerhino.java.playground.guava.mybatis.leetcode.juc.guice.service.SayHello;
import priv.bluerhino.java.playground.juc.guice.module.HelloModule;
import priv.bluerhino.java.playground.juc.guice.service.SayHello;
import priv.bluerhino.java.playground.leetcode.juc.guice.service.SayHello;
import priv.bluerhino.java.playground.mybatis.leetcode.juc.guice.service.SayHello;

/**
 * Hello world!
 */
public class App {
    public String tomSayHello(String name) {
        Injector injector = Guice.createInjector(new HelloModule());
        SayHello sayHello = injector.getInstance(SayHello.class);
        return (sayHello.hello(name));
    }
}
