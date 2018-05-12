package priv.bluerhino.java.playground.guice.serviceImpl;

import priv.bluerhino.java.playground.guice.service.SayHello;

/**
 * Created by niekunlin @ 18/5/12.
 */
public class SayHelloTom implements SayHello {
    private static final String myName = "tom";

    @Override
    public String hello(String name) {
        return "Hello " + name + ".I'm " + myName + ".";
    }
}
