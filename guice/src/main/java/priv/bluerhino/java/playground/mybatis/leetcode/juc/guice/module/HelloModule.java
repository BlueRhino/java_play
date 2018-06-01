package priv.bluerhino.java.playground.mybatis.leetcode.juc.guice.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import priv.bluerhino.java.playground.juc.guice.service.SayHello;
import priv.bluerhino.java.playground.juc.guice.serviceImpl.SayHelloTom;
import priv.bluerhino.java.playground.leetcode.juc.guice.service.SayHello;
import priv.bluerhino.java.playground.mybatis.leetcode.juc.guice.service.SayHello;

/**
 * Created by niekunlin @ 18/5/12.
 */
public class HelloModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(SayHello.class).to(SayHelloTom.class);
    }
}
