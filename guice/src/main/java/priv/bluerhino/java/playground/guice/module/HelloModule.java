package priv.bluerhino.java.playground.guice.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import priv.bluerhino.java.playground.guice.service.SayHello;
import priv.bluerhino.java.playground.guice.serviceImpl.SayHelloTom;

/**
 * Created by niekunlin @ 18/5/12.
 */
public class HelloModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(SayHello.class).to(SayHelloTom.class);
    }
}
