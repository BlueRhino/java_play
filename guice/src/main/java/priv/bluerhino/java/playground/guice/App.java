package priv.bluerhino.java.playground.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import priv.bluerhino.java.playground.guice.module.HelloModule;
import priv.bluerhino.java.playground.guice.service.SayHello;

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
